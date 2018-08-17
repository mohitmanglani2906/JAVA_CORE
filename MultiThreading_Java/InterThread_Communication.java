// Here we will the famous producer-consumer problem using interthread communication

class Operation
{
	int num;
	boolean valueSet=false;
	public synchronized void put(int num)
	{
		while(valueSet)
		{
			try{wait();}catch(Exception e){}
		}
		System.out.println("Put :" + num);
		this.num=num;
		valueSet=true;
		//try{notify();}catch(IllegalMonitorStateException il){}  
		notify();
		
	}

	public synchronized void get()
	{
		while(!valueSet)
		{
			try{ wait(); }catch(Exception e){}
		}
		System.out.println("Get :" + num);
		valueSet=false;
		notify();
		//try{notify();}catch(IllegalMonitorStateException il){}
	}
}

class Producer implements Runnable
{
	Operation op;
	public Producer(Operation op)
	{
		this.op=op;
		Thread t=new Thread(this,"Producer");
		t.start();
	}

	public void run()
	{
		int i=0;
		while(true)
		{
			op.put(i++);
			try{Thread.sleep(1000);} catch(Exception e){}
		}
	}
}

class Consumer implements Runnable
{
	Operation op;
	public Consumer(Operation op)
	{
		this.op=op;
		Thread t=new Thread(this,"Consumer");
		t.start();
	}

	public void run()
	{
		int i=0;
		while(true)
		{
			op.get();
			try{Thread.sleep(1000);} catch(Exception e){}
		}
	}
}



class InterThread_Communication
{
	public static void main(String []args)
	{
		Operation op=new Operation();
		new Producer(op);     /* Anonomous type of object*/
		new Consumer(op);
	}
}