//Here we will see the what happens when two different threads calls same method at same time
class Counter
{
	int count;
	public synchronized void increment() // we have to synchronized the method as it should be called by one thread at a time
	{
		count++;
	}
}

class Synchronization_InmultiThreading 
{
	public static void main(String []args) throws Exception
	{
		Counter c=new Counter();
		Thread t1=new Thread(new Runnable()
		{
			public void run()
			{
				for(int i=1;i<=1000;i++)
				{
					c.increment();
				}
				
			}
		});

		Thread t2=new Thread(new Runnable()
		{
			public void run()
			{
				for(int i=1;i<=1000;i++)
				{
					c.increment();
				}
				
			}
		});

		t1.start();    // call start method to call run method
		t2.start();		// same for thread 2
		t1.join();      // call join method to complete the task of Thread 1
		t2.join();     // same for thread 2

		System.out.println("Count " + c.count);
	}
	

}