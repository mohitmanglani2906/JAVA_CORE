// here we will see string validation in java using matches() method
import java.util.Scanner;
class String_validation
{
	public static void main(String []args)
	{
		String str;
		String regex = "(.*)@gmail.com";   // before @gmail.com there cna be anything but it is necessary that @gmail.com is present in regex
		Scanner  s=new Scanner(System.in);
		System.out.println("Enter mail id : ");
		str=s.nextLine();
		if(str.matches(regex))    // the mathces method is used to check weather the string is valid or not
		{
			System.out.println("String is valid : " +str);
		}
		else
		{
			System.out.println("Does not match");
		}
	}
}		