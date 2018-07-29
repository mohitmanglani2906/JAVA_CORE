// here we will see what is array out of bound exception
class AarrayIndex_OutofBound
{
	public static void main(String []args)
		{
				int arr[]=new int[5];
	try
	{
		for(int i=0;i<=6;i++)
			{
				arr[i]=i+1;
			}
		for(int i:arr)
			{
				System.out.println(i);
			}				
	}
	catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("The maximum size is 5 :" + e);
		}

	}
	
}
	
