// Here we will see throws keyword i.e we can use it in method definition
class Demo
{
	public void show() throws ClassNotFoundException,ArrayIndexOutOfBoundsException //more than one exception canbe thrown
	{
		System.out.println("In show method");
		throw new ClassNotFoundException();   // here this exception will be thrown 
	}
}
class Throws_Keyword 
{
	public static void main(String[] args) 
	{
		Demo d1=new Demo();
		int a[]=new int[10];
		try
		{
			d1.show();
			a[11]=56;
		}
		catch(ClassNotFoundException ce) // here this exception will be caught as we are throwing it from class
		{
			System.out.println(ce);
		}
		catch(ArrayIndexOutOfBoundsException ae)
		{
			System.out.println(ae);
		}
	}
}
