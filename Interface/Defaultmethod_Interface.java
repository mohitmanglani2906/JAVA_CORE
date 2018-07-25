// How can we define a method in interface for this we can use default method in java
interface i1
{
	default void show()
		{
			System.out.println("IN show");
		}
}
class i2 implements i1
{
	void display()
		{
			System.out.println("In display");
		}
}		
class Defaultmethod_Interface
{
	public static void main(String []args)
		{
			i2 obj=new i2();
			obj.display();
			obj.show();
			
		}
}
