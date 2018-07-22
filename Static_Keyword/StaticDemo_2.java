class Demo
{
	static int i;
	int j;
	public void show() // you have to define a non-static method so that static value can be used in that
	{
		System.out.println(i);  // no error
	}
	
}
class StaticDemo_2
{
	public static void main(String []args)
		{

			Demo d=new Demo();
				
				d.show();
				Demo.i=12;
		}
}