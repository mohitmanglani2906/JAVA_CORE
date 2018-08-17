// Here we will see join and isAlive method in Multithreading
class Join_IsAlive_Method
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
		});			

		Thread t2=new Thread(() ->
		{	  
			{
				for(int i=1;i<=5;i++)
				{
					System.out.println("Hello");
					try{Thread.sleep(500);} catch(Exception e){}
				}
			}
		});

		t1.start();
		try{Thread.sleep(10);} catch(Exception e){}			
		t2.start();	

		System.out.println(t1.isAlive());    // IsAlive() method checks that method is alive or not // return true or false

		t1.join();    // thrown an InterruptedException 
		t2.join();		// method is used to complete the action of thread t1 and thread t2 before the main thread

		System.out.println(t1.isAlive());    // After the complition of the method execution of the thread is dead as returns false

		System.out.println("Bye :");
	}	
	
}