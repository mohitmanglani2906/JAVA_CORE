// Here we will see why string is immutable
class String_Immutable
{
	public static void main(String []args)
		{
			String str="Mohit";   // here Mohit is stored at some perticular address and 
			String str1="Mohit";  // here Mohit is also stored at some perticular address which is same as for str 
									// so address of str= address of str1
			str="Manglani";				// here str is stored at different address and therefore address of str is not equal to str 1
			System.out.println(str);		
			String s1=new String("Mohit"); // it makes new object and stored at perticular address in heap memory

		}
	
}