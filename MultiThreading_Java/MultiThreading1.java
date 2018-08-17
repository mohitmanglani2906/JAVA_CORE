// Here we will see introduction  to multithreading in java and how to start different  activity  at differen time
class Thread1 extends Thread
{
	public void run()    // start method can only call run method
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("Hi");
			try{Thread.sleep(500);} catch(Exception e){}

		}
	}

	/*public void show()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("Hi");
			try{Thread.sleep(500);} catch(Exception e){}

		}
	}*/
}
class Thread2 extends Thread
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("Hello");
			try{Thread.sleep(500);} catch(Exception e){}			
		}
	}

	/*public void show()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("Hello");
			try{Thread.sleep(500);} catch(Exception e){}

		}
	}*/
}
class MultiThreading1
{
	public static void main(String []args)
	{
		Thread1 t1=new Thread1(); // object of Thread1 class
		Thread2 t2=new Thread2(); // object of Thread2 class
		t1.start();                // class Thread1 extends Thread class so it can call start() method same for Thread2 class
		try{Thread.sleep(500);} catch(Exception e){} /* this portion will call run method of class Thread one by one
																		*/
		t2.start();
		/*t1.show();	/*
							this portion simply prints the both method in Thread1 class and Thread2 class i.e show() method
		t2.show();*/
	}
}