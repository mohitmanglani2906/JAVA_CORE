
package gtupapers;

/*
Write a complete multi threaded program to meet following requirements for producer-consumer threads:
- Three threads – one producer and two consumers to be instantiated in the method main.
- At a time, the producer produces one integer information along with \
  consumer_id to represent id of a consumer that will consume produced information.
- Information and consumer_id are stored in a shared buffer.
- The information produced is to be consumed by appropriate consumer only, as specified by the producer.
- The producer thread produces total 6 information
*/

class Operator
{
    int num;
    int id;
    boolean valueSet=false;
    public synchronized void  put(int id,int num)
    {
        while(valueSet)
        {
            try{wait();}catch(Exception e){}
        }
        System.out.println("Put : id : " + num + " "+ id);
        this.num=num;
        valueSet=true;
        notify();
    }
    
    public synchronized 
    void get(int id)
    {
        while(!valueSet)
        {
            try{wait();}catch(Exception e){}
        }       
        System.out.println("Get : id : " + num + " " + id);
        valueSet=false;
        notify();
       
    }
}

class Producer implements Runnable
{
    Operator op;
    public Producer(Operator op)
    {
        this.op=op;
        Thread t1 = new Thread(this,"Producer");
        t1.start();
    }
    public void run()
    {
        int num=0;
        for(int i=1;i<=6;i++)
        {
            if(i%2!=0) op.put(1,++num);
            else       op.put(2,++num);
        }
    }
}
class Consumer1 implements Runnable
{
     Operator op;
     Consumer1(Operator op)
     {
         this.op=op;
         Thread t2 = new Thread(this,"Consumer1");
         t2.start();
     }
     public void run()
    {
        for(int i=1;i<=6;i++)
        {
            if(i%2!=0)
            {
                op.get(1);
                try{Thread.sleep(2000);}catch(Exception e){}
            }   
        }
    }
    
}
class Consumer2 implements Runnable
{
     Operator op;
     Consumer2(Operator op)
     {
         this.op=op;
         Thread t3 = new Thread(this,"Consumer2");
         t3.start();
     }
    public void run()
    {
        for(int i=1;i<=6;i++)
        {
            if(i%2==0)
            {
                op.get(2);
                try{Thread.sleep(2000);}catch(Exception e){}
            }
        }
    }
}

public class B416W 
{
    public static void main(String[] args) 
    {
        Operator op = new Operator();
        new Producer(op);
        new Consumer1(op);
        new Consumer2(op);
    }
}
