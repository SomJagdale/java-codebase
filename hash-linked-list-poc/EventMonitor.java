import java.io.*; 
import java.util.*; 

public class EventMonitor implements Runnable
{
	private HashMap<Integer, ListNode>          m_hash ;
    private ArrayList<TimerNode>                m_timeSlots ;
	private	Queue<SubscriberExpiryProfile> 		m_inQueue ;

	private int 								m_currSlotIndex ;
	private int 								m_numTimeSlots ;
	private int 								m_slotLength ;
	private int 								m_sleepTime ;
	private boolean 							m_slotTimerOn ;
	private boolean 							m_timerOn ;
	private boolean                             m_shouldHandleExpiry ;

	public static SubscriberProfileMonitor objSubscriberProfileMonitor = new SubscriberProfileMonitor() ;
	public static SubscriberProfileMonitor.ExpiryHandler m_expiryHandler = objSubscriberProfileMonitor.new ExpiryHandler();


	public class ListNode
	{
		SubscriberExpiryProfile data ;
		ListNode                next ;
		TimerNode               slotPtr ;
	}

	public class TimerNode
	{
		ListNode   firstNode ;
		Integer    slotNum ;
	}

	public EventMonitor(int size, int numTimeSlots, int slotLength)
	{
	    int inQueueSize = ((size/numTimeSlots) < 2) ? 2 : (size/numTimeSlots) ;

		m_timerOn      = false ;
		m_slotTimerOn  = false ;
		m_currSlotIndex = 0 ;

		m_hash = new HashMap<Integer, ListNode>(size);
		m_timeSlots = new ArrayList<TimerNode>(numTimeSlots+2) ;
		m_inQueue = new LinkedList<>() ;

		if (m_hash == null && m_timeSlots == null)
		{
			System.out.println("hash and timeSlots are not initialised");
			return ;
		}

		for (int i = 0; i < numTimeSlots ; i++)
		{
			TimerNode objTimerNode = new TimerNode();
			objTimerNode.slotNum = i ;
			objTimerNode.firstNode = null ;
		}
	}

	public void insertAt(SubscriberExpiryProfile obj)
	{
		System.out.println("Adding imsi in hash "+ obj.imsi);

		ListNode currentNode = m_hash.get(obj.imsi) ;

		if(currentNode == null) 
		{
			ListNode objListNode = new ListNode() ;
			objListNode.data = obj;
			objListNode.slotPtr = m_timeSlots.get(m_currSlotIndex) ;
			objListNode.next = null ;

			m_hash.put(obj.imsi, objListNode);

			if (objListNode.slotPtr.firstNode != null)
			{
				objListNode.next = objListNode.slotPtr.firstNode ;
			}

			objListNode.slotPtr.firstNode = objListNode ;
			System.out.println("firstNode : " + objListNode.slotPtr.firstNode.data.imsi + "  ");
		}
		else
			move(currentNode) ;

		displayContent();
	}

	public void move(ListNode currentNode)
	{
		System.out.println("move : " + currentNode);
		detachFromCurrSlot(currentNode);

		currentNode.slotPtr = m_timeSlots.get(m_currSlotIndex) ;

		if (currentNode.slotPtr.firstNode != null)
			currentNode.next = currentNode.slotPtr.firstNode ;

		currentNode.slotPtr.firstNode = currentNode ;
	}

	public void detachFromCurrSlot(ListNode currNode)
	{
		if(currNode.slotPtr.firstNode == null) 
		{
			System.out.println("detachFromCurrSlot : currNode.slotPtr.firstNode == null ");
		}
		else if (currNode.slotPtr.firstNode != currNode)
		{
			System.out.println("detachFromCurrSlot currNode.slotPtr.firstNode "+currNode.slotPtr.firstNode.data.imsi+" != currNode " + currNode.data.imsi);
			ListNode tmpFirstNode = m_hash.get(currNode.slotPtr.firstNode.data.imsi) ;

			SubscriberExpiryProfile tempData = currNode.data ;
			currNode.data = currNode.slotPtr.firstNode.data ;
			currNode.slotPtr.firstNode.data  = tempData ;

			System.out.println("after swap : detachFromCurrSlot currNode.slotPtr.firstNode "+currNode.slotPtr.firstNode.data.imsi+" != currNode" + currNode.data.imsi);
		}

		currNode.slotPtr.firstNode = currNode.slotPtr.firstNode.next;
	}

	public boolean delete(SubscriberExpiryProfile obj)
	{
		System.out.println("Deleting imsi from hash "+ obj.imsi);

		ListNode currentNode = m_hash.get(obj.imsi) ;

		if (currentNode == null)
		{
			System.out.println("key "+ obj.imsi + "is not present to delete");
		}

		m_hash.remove(obj.imsi);
		System.out.println("Deleting node from slot "+ currentNode.data + "slotnum "+ currentNode.slotPtr.slotNum) ;

		detachFromCurrSlot(currentNode) ;
		displayContent();

		return true ;
	}

	public void displayContent()
	{
		System.out.println("Hash Content : " + m_hash);
		for (int i = 0; i < m_timeSlots.size() ; i++)
		{
			System.out.print(m_timeSlots.get(i).slotNum + " Slot Content : ");

			ListNode tempNode = m_timeSlots.get(i).firstNode ;
			while(tempNode != null)
			{
				System.out.print(tempNode.data.imsi + "  ");
				tempNode = tempNode.next;
			}
			System.out.println("  ");
		}
	}


	public void startSlotTimer() throws InterruptedException
	{
		System.out.println("Slot Timer thread started");

		if (m_slotTimerOn)
		{
			System.out.println("Slot timer thread already running.") ;
		}

		m_slotTimerOn = true ;

		while (isSlotTimerOn())
		{
			Thread.sleep(getTimeSlotLength()) ;

			if (isSlotTimerOn())
				slotExpired() ;
		}

		System.out.println("Timer thread is stopped") ;

	}

	public void startExpiryHandler() throws InterruptedException
	{
		System.out.println("Expiry Handler Thread started");

		while (isTimerOn())
		{
			Thread.sleep(60) ;
			handleTimedoutNodes() ;
		}

		System.out.println("Expiry Handler Thread stopped.") ;

		return ;

	}

	public void startInsertHandler()
	{
		System.out.println("Insert Handler Thread started");

		while (isTimerOn())
		{
			SubscriberExpiryProfile data = getFromInQueue() ;
			insertAt(data) ;
		}

		System.out.println("Insert Handler Thread stopped.") ;
	}

	public void run()
	{
		try {
		if (Thread.currentThread().getName().equals("StartSlotTimer"))
			startSlotTimer();
		else if (Thread.currentThread().getName().equals("StartExpiryHandler"))
			startExpiryHandler();
		else if (Thread.currentThread().getName().equals("StartInsertHandler"))
			startInsertHandler();
		else 
			System.out.println("wrong thread name");
		}
		catch(Exception InterruptedException){}

	}

	public boolean   isTimerOn() { 
		return m_timerOn ; 
	}

	public boolean isSlotTimerOn() { 
		return m_slotTimerOn ; 
	}

	public int getTimeSlotLength()
	{
		return m_slotLength ;
	}

	public void slotExpired()
	{
		System.out.println("Present time slot is expired.") ;
		m_currSlotIndex = (m_currSlotIndex + 1)%(m_numTimeSlots) ;
	}

	public boolean addToMonitor(SubscriberExpiryProfile data)
	{
		return m_inQueue.add(data) ;
	}

	public SubscriberExpiryProfile getFromInQueue()
	{
		return m_inQueue.poll() ;
	}

	public boolean handleTimedoutNodes()
	{
		int expiredIndex = ((m_currSlotIndex + 1) % m_numTimeSlots);

		int   count = 0 ;
		int   totalCount = 0 ;
		int   keyLen = 0 ;

		while (m_timeSlots.get(expiredIndex).firstNode == null)
		{
			count++ ;
			totalCount++ ;

			ListNode temp = m_timeSlots.get(expiredIndex).firstNode ;
			m_timeSlots.get(expiredIndex).firstNode = temp.next ;
			temp.next = null ;
			temp.slotPtr = null ;

			m_expiryHandler.handleExpiry(temp.data) ;

			delete(temp.data) ;
		}

		if (totalCount > 0)
			System.out.println("Successfully handled and deleted " + totalCount + " expired events from the expired list.") ;

		return true ;
	}
}
