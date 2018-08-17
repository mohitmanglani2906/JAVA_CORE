// Here we will use Lamda expression and annomous class to implement multuthreading

class Lambdaexpression_Multithreading
{
	public static void main(String []args)
	{
		Runnable obj1;
		Runnable obj2;					
		Thread t1=new Thread(() ->          // I have used in Lamda expression here which we can implement here
		{
												// we can write like this if we have 
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
	}	
	
}