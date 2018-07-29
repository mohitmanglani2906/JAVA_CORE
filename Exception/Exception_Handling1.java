// Here we will see simple try and catch block using the example divide b zero problem
class Exception_Handling1
{
	public static void main(String []args)
		{
			int i,j,k=0; // k should be initialized 	
			i=45;
			j=0;			
			try
				{
					k=i/j;         // From here exception will be thrown to catch if found
				}
				catch(ArithmeticException e)
				{
					System.out.println(e);
				}
			System.out.println(k);
			
		}
}
