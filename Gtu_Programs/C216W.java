/*
/*Declare a class called Book having book title & author name as members.
 Create a sub-class of it, called BookDetails having price & current stock of book as members. 
 Create an array for storing details of n books. 
 Define methods to achieve following: 
- Initialization of members 
- To query availability of a book by author name / book title 
- To update stock of a book on purchase and sell 
Define method main to show usage of above methods. */



package gtupapers;

import java.util.Scanner;

class Book
{
	String book_title[]=new String[1000];
	String author[]=new String[1000];
}
class Book_Details extends Book
{
	double price[]=new double[3];
	int stock[]=new int[3];
	int id[]=new int[3];
	Scanner s=new Scanner(System.in);
	 void book_data(int id)
	{
		price[id]=s.nextDouble();
		stock[id]=s.nextInt();
		book_title[id]=s.next();
		author[id]=s.next();
	}

	void show(int i)
	{
                System.out.println(" id : " + i);
		System.out.print(" price: " + price[i]);
		System.out.print(" stock: " +stock[i]);
		System.out.print(" book_title: " +book_title[i]);
		System.out.print(" author: " +author[i]);
	}


	boolean query(String book_tit,String auth)
	{
            boolean value=false;
            
		for(int i=0;i<3;i++)
		{
                   // System.out.println("we are here!!");
                    if(book_title[i].equals(book_tit))
                    {
                       // System.out.println("we r in if!!");
                        value=true;
                        System.out.println(book_title[i] + " " + book_tit);
                    }
		}
                return value;
		
	}
        
        int update_onPurchase(int id,int book_purchased)
        {
            int new_stock=0;
            for(int i=1;i<=book_purchased;i++)
            {
                new_stock=++stock[id];
            }
            return new_stock;
        }
        
        int update_onSell(int id,int book_selled)
        {
            int new_stock=0;
            for(int i=1;i<=book_selled;i++)
            {
                new_stock =--stock[id];
            }
            return new_stock;
        }

	/*void update_on_purchase()
	{
		this.stock++;
	}
	void update_on_sell()
	{
		this.stock--;
	}*/

}
class C216W
{
	public static void main(String []args)
	{
		Book_Details bd1=new Book_Details();
                int book_purchased=0,book_selled=0;
                int id;
                Scanner s = new Scanner(System.in);
                
		for(int i=0;i<3;i++)
		{
			System.out.println("Enter follwing data for book id : " + (i+1));
			System.out.println("price: " + " stock: " + " book_title: " + " author: ");
			bd1.book_data(i);
		}
                
		for(int i=0;i<3;i++)
		{
			bd1.show(i);
			System.out.println("\n");
		}
		System.out.println("Book is availble or not :" + bd1.query("hello","mohit"));
                
                System.out.println("Enter book id and no. of book to  be purchased :");
                id=s.nextInt();
                book_purchased=s.nextInt();
                int new_stock= bd1.update_onPurchase(id, book_purchased);
                System.out.println("After purchasing the book new stock is : " + new_stock);
                
                System.out.println("Enter book id and no. of book are sold : ");
                id=s.nextInt();
                book_selled=s.nextInt();
                int new_selledStock = bd1.update_onSell(id, book_selled);
                System.out.println("After selling the book new stock  is : " + new_selledStock);
                
                
                
                
                
                
                
                
		/*System.out.println(get);
		bd1.update_on_purchase(); System.out.println("After purchasing one book :" +bd1.stock);  bd1.show();
		bd1.update_on_sell();  System.out.println("After selling one book" +bd1.stock);*/

		
	}
}




