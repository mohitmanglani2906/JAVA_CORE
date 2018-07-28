// This is the introduction to String class in java
import java.util.Scanner;
class String_Intro
{
	public static void main(String []args)
		{
			String str="Hi My name is Mohit Manglani";  
			System.out.println(str);
			String s1=new String("HI I study in vvp engineering college : ");
			System.out.println(s1);
			Scanner s=new Scanner(System.in); // Scanner class object for user input
			System.out.println("Enter your string : ");
			String s2=s.nextLine(); // for user input
			System.out.println(s2);

		}
}
