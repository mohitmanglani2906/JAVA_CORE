
package gtupapers;

import java.util.Scanner;

/*Write a program to create two threads, one thread will check whether given number
is prime or not and second thread will print prime numbers between 0 to 100.*/

class Thread1 extends Thread
{
    int num;
    int check=0;
    public void run()
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Entern a number: ");
        num=s.nextInt();
        for(int i=2;i<num;i++)
        {
            if(num%i==0)
            {
                check++;
                //break;
            }
            if(check==1)
            {
                System.out.println("No is not prime: " + num);
                break;
            }
            else
            {
                System.out.println("No is prime: " + num);
                break;
            }
        }
     
            
        
    }
}
class Thread2 extends Thread
{
    int check=0;
        public void run()
        {
            int num;
            for(num=0;num<=100;num++)
            {
                for(int j=2;j<num;j++)
                {
                    if(num%j==0)
                    {
                        check++;
                        break;
                    }
                }
                if(num==0)
                {
                    
                }
                else if(num==1)
                {
                    
                }
                else if(check==1)
                {
                    //System.out.println("No is not prime: " + num);
                    check=0;
                }
                else
                {
                    System.out.println("No is Prime :" + num);
                }
                
            }
            System.out.println("last number checked:" + (num-1));
            
        }
    
}

public class C518 
{
    public static void main(String[] args) throws Exception
    {
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();
        t1.start();
        Thread.sleep(5000);
        t2.start(); 
      
      /*try
        {
            t1.join();
            t2.join();
        }
        catch(InterruptedException e)
        {
            System.out.println(e.getMessage());*/
        }
      
        
}

