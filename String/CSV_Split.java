// split method in java
class CSV_Split
{
	public static void main(String []args)
		{
			String str="Mohit Jayesh Mahesh Pradeep";
			String names[]=str.split(" "); // split methid can be used only with String charcater array
			for(String val:names)     // enhanced for loop
				System.out.println(val);
		}
}