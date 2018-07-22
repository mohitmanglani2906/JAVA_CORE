import java.util.*;
class Palindrome1
{

    public static void main(String args[])
    {
   
   
    Scanner s=new Scanner(System.in);
			    System.out.println("Enter the string");
			    String st1=s.nextLine();
    StringBuffer sb=new StringBuffer(st1);
                 sb.reverse();

        
        if(st1.equals(sb.toString()))
        System.out.println("Palindrome String");
    	else
    	System.out.println("not a palindrome string : ");

    }

}
