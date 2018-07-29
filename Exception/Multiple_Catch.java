// here we will see multiple catch in java using artimetic exception and ioexception
import java.util.Scanner;
import java.io.*;
class Multiple_Catch
{
		public static void main(String []args) 
			{

				int i,j,k=0;
				i=45;
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	try
	{
		System.out.println("Enter a number : ");
		j=Integer.parseInt(br.readLine());        // for ioexception
		k=i/j;
		System.out.println(k);
	}	
	catch(IOException e)
	{
		System.out.println("IOException occured : " +e);
	}
	catch(ArithmeticException e)
	{
		System.out.println("Can't divide by zero : " +e);
	}
	
	finally         // atlast  this block is executed only once in a program
	{
		System.out.println("Bye and Get lost : ");
	}

			}
	

}