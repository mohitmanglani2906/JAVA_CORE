
package gtupapers;

import java.util.Scanner;

/*
    Write a multithreaded program to compute and print prime numbers up to n where n is given as command line argument.
    Instantiate requited number of threads where each thread except the last, 
    examines next 50 numbers and the last thread examines remaining numbers to check whether a number is a prime or not
*/

class Counter
{
    int n;
    Counter(int n)
    {
        this.n=n;  
    }
    public  int count_n()
    {
        return n-100;
    }
    
}

public class B416
{
    
    public static void main(String[] args) throws Exception
    {
        int num;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number: ");
        num=s.nextInt();
        Counter c = new Counter(num);
        
        Thread t1 = new Thread(new Runnable()
        {
            
            public void run()
            {
                System.out.println("A first Thread :");
                int check=0;
                int i;
                for(i=0;i<=50;i++)
                {
                    for(int j=2;j<i;j++)
                    {
                        if(i%j==0)
                        {
                           // System.out.println("");
                            check++;
                            break; 
                        } 
                    }
                    if(i==0)
                    {
                    }
                    else if(i==1){}
                    
                    else if(check==1)
                    {
                       // System.out.println("No is not Prime: " + i);
                        check=0;
                    }
                    else
                    {
                        System.out.println("Prime number :" + i);
                    }
                }
                //System.out.println("Last number chekcedL:  "+ i);
            }
        });
        
        Thread t2 = new Thread(new Runnable()
        {
           public void run()
           {
               System.out.println("A second Thread : ");
               int check=0;
               for(int i=51;i<=100;i++)
               {
                   for(int j=2;j<i;j++)
                   {
                       if(i%j==0)
                       {
                           check++;
                           break;
                       }
                   }
                   if(check==1)
                   {
                       check=0;
                   }
                   else
                   {
                       System.out.println("Prime Number : " + i);
                   }   
               }
               
           }
        });
        
        Thread t3 = new Thread(new Runnable()
        {
            public void run()
            {
                System.out.println("A third Thread : ");
                int check=0;
                int remainning = c.count_n();
               // System.out.println(remainning);
                int total = 100+remainning;
               // System.out.println("total " + total);
                for(int i=101;i<=total;i++)
                { 
                    for(int j=2;j<i;j++)
                    {
                        if(i%j==0)
                        {  
                            check++;
                            break;
                        }
                    }
                    if(check==1)
                    {
                        
                        check=0;
                    }
                    else
                    {
                        System.out.println("Prime number  : " +i);
                    }
                    
                }
            }
            
        });
        
        t1.start();
        Thread.sleep(3000);
        t2.start();
        Thread.sleep(3000);
        t3.start();
    }
   
}
