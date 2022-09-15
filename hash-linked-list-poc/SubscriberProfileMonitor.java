//final DEF_EXPIRY_PROFILE_SIZE      500000
//final DEF_USER_PROFILE_NUM_SLOTS   24
//final DEF_USER_PROFILE_SLOT_LENGTH 3600

public class SubscriberProfileMonitor
{

	//public SubscriberProfileMonitor() {}
	static SubscriberProfileMonitor  GetInstance() 
	{
		if (m_self != null)
			return m_self ;

		m_self = new SubscriberProfileMonitor() ;

		if (m_self == null)
			return null ;
		return m_self ;
	}

	static boolean Initialize() 
	{
		int size = 10000000 ; //CConfiguration::GetInt("expiry.profile.hash.size") ;

		if (size <= 0)
		{
			size = 10000000 ; // DEF_EXPIRY_PROFILE_SIZE
			System.out.println("'expiry.profile.hash.size' is not specified in the configuration file. Assuming default size of "+ size) ;
		}

		System.out.println("Expiry Profile hash size" + size);

		int numSlot = 4 ; // CConfiguration::GetInt("profile.timer.num.slots") ;

		if (numSlot <= 0)
		{
			numSlot = 24 ; // DEF_USER_PROFILE_NUM_SLOTS ;
			System.out.println("'profile.timer.num.slots' is not specified in the configuration file. Assuming default size of "+ numSlot) ;
		}

		System.out.println("Number of profile hash time slots = "+ numSlot) ;

		int slotLen = 10 ;//CConfiguration::GetInt("profile.timer.slot.time") ;

		if (slotLen <= 0)
		{
			slotLen = 3600 ; // DEF_USER_PROFILE_SLOT_LENGTH ;
			System.out.println("'profile.timer.slot.time' is not specified in the configuration file. Assuming default size of "+ slotLen) ;
		}

		System.out.println("Profile hash time slot length = "+ slotLen) ;

		EventMonitor m_expiryHash  = new EventMonitor(size, numSlot, slotLen) ;

		new Thread(m_expiryHash, "StartSlotTimer").start();
		new Thread(m_expiryHash, "StartExpiryHandler").start();
		new Thread(m_expiryHash, "StartInsertHandler").start();

		//m_expiryHash.insertIntoHash();

		//Thread.sleep(2000);
		//System.out.println(" Moving to another slot ");
		//m_expiryHash.insertIntoHash();
		//System.out.println(" Delete item from hash ");
		//m_expiryHash.delete();


		m_initialized = true ;
		return true ;
	}
	static SubscriberProfileMonitor                   m_self ;
	static EventMonitor     						  m_expiryHash ;
	static boolean                                    m_initialized ;

    private int m_srdcResetTime ;
	private boolean m_shouldHandleExpiry ;

	public class ExpiryHandler
	{
		public boolean handleExpiry(SubscriberExpiryProfile data)
		{
			System.out.println("Profile for IMSI ["+data.imsi+"] is expired.") ;

			if (data.lastULSRDCResetTime < m_srdcResetTime)
			{
//				System.out.println("SRDC count was Not decrementing for this old profile imsi ["+data.imsi+"] zone ["+data.zone+"] cos ["+data.appliedCOS+"] nwId ["+data.nwID+"] last SRDC Reset Time ["+data.lastULSRDCResetTime+"] and srdcResetTime ["+m_srdcResetTime+"]", data.imsi, data.zone, data.appliedCOS, data.nwID, data.lastULSRDCResetTime, m_srdcResetTime) ;
				return true ;
			}

			if(m_shouldHandleExpiry)
			{
				//SoRCountsHandler.getInstance().incrementCounts(data.hnwid, data.zone, data.appliedCOS, data.nwID) ;

				// ((CSVLogger) TraceInitializer.getInstance().getLogger("sorafdata")).log(sorafData) ;
			}
			return true ;
		}
	}
}


