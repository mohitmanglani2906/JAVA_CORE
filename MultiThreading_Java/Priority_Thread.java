// Here we will see priorities of thread in multithreading 
// we will use getName(),setName().currentThread(),getpriority() methids
// These all are static methods so we can call them using Thread class direclty

class Priority_Thread
{
	public static void main(String []args) throws Exception
	{
		Runnable obj1;
		Runnable obj2;					
		Thread t1=new Thread(() ->          // I have used in Lamda expression here which we can implement here
		{									// we can write like this if we have 
			{
				for(int i=1;i<=5;i++)
				{
					System.out.println("Hi");
					try{Thread.sleep(500);} catch(Exception e){}
				}
			}	
		},"hi Thread 1");					 // we can give name to the threads 		

		Thread t2=new Thread(() ->
		{	  
			{
				for(int i=1;i<=5;i++)
				{
					System.out.println("Hello");
					try{Thread.sleep(500);} catch(Exception e){}
				}
			}
		},"Hello Thread 2"); 		 		  // we can give name to the threads 	

		System.out.println(t1.getName());    // Gives the name of the thread
		System.out.println(t2.getName());

		t1.setPriority(Thread.MIN_PRIORITY);/* Here we have defined the priorty of the thread1 and thread2*/
		t2.setPriority(Thread.MAX_PRIORITY);
		System.out.println(t1.getPriority());  // here we have obtained the priorty of the thread1 and thread2
		System.out.println(t2.getPriority());

		t1.start();
		try{Thread.sleep(10);} catch(Exception e){}			
		t2.start();	

		System.out.println(t1.isAlive());    // IsAlive() method checks that method is alive or not // return true or false

		t1.join();      					 // thrown an InterruptedException 
		t2.join();							 // method is used to complete the action of thread t1 and thread t2 before the main thread

		System.out.println(t1.isAlive());    // After the complition of the method execution of the thread is dead as returns false

		t1.setName("Mohit");      			 // we  can set the name of the thread using setName() methods
		System.out.println(t1.getName());

		
		
	}	
	
}
