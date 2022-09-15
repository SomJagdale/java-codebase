We will create 3 below threads 
1.	Timer Thread - It will run according to profile.timer.slot.time(will be part of fsmapp.properties).
2.	Expiry Handler - It will run for each minute on expiry slot only.
3.	Insert Handler - It will read ProfileExpiry Message Queue and add it to Hash Monitor.

Threading model - By implementing Runnable interface
To Store and Monitor SubscriberProfileExpiry we are considering below java collection classes.

We will be using ArrayList<HashMap<supi, SubscriberProfileExpiry>>
Where ArrayList size would be profile.timer.num.slots

Below Queue will be used by worker thread to put ProfileExpiry entry.
