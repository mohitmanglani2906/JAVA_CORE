// toString() method in java
// Aadvantage: After converting to string we can use string method to string object 
// such that string_object.method_name();

class ToString
{
	public static void main(String []args)
		{
			StringBuffer str=new StringBuffer();
			System.out.println("Enter a string buffer object " );// here nextLine() method can be used only for string so 
			str.append(s.nextLine());       // we have used append method to get the user input
			String new_string=str.toString();  // toString method is used to convert stringbuffer to string
			System.out.println("your converted string is  : " + new_string);
		}
}