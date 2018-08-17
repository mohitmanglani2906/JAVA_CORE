// Here we will see Runable Interface in java and how it worlks
class Thread1 implements Runnable
{
	public void run()    // start method can only call run method
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("Hi");
			try{Thread.sleep(500);} catch(Exception e){}
		}
	}	
}
class Thread2 implements Runnable

{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("Hello");
			try{Thread.sleep(500);} catch(Exception e){}			
		}
	}	
}
class Runnable_Interface
{
	public static void main(String []args)
	{
		Runnable obj1=new Thread1(); // refernece of interface(Runnable) and object of Thread1 class(subclass)
		Runnable obj2=new Thread2(); // refernece of interface(Runnable) and object of Thread2 class(subclass)
		/*t1.start();                // class Thread1 extends Thread class so it can call start() method same for Thread2 class
		try{Thread.sleep(500);} catch(Exception e){} 	  This part will not execute because Thread1 and Thread2 does not														
		t2.start(); 										extends Thread class 	*/
		Thread t1=new Thread(obj1);			// linking of object of class Thread 1 and Thread2
		Thread t2=new Thread(obj2);
		t1.start();
		try{Thread.sleep(10);} catch(Exception e){}			
		t2.start();	
	}
}