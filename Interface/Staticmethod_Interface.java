// We can define a method in an interface using static method
interface i1
{
	static void show()
	{
		System.out.println("In show");
	}
}
class i2 implements i1
{
	void display()
	{
		System.out.println("IN display");
	}
}
class Staticmethod_Interface
{
	public static void main(String []args)
		{
			i1.show();
		}

}