import java.util.Scanner;
class Array_2
{
	public static void main(String []args)
	{

		int a[]=new int[20];
		Scanner s=new Scanner(System.in);
		for(int i=0;i<5;i++)
		{
			a[i]=s.nextInt();
		}
		System.out.println("Elements are :");
		for(int i:a)             // enhanced for loop prints all the values till size of an array if array element is not initialized then compiler assignes '0' to array element

				{
					System.out.println(i);
				}


	}
	

}