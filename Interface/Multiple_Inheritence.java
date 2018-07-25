// Multiple inheritence using interface
interface i1 
{
	void show();
}
interface i2
{
	void display();
}
class Subclass implements i1,i2 class Subclass extends interface i1 and i2
{
	public void show()
		{
			System.out.println("In show");
		}
	public void display()
		{
			System.out.println("In display");
		}	

}
class Multiple_Inheritence
{
	public static void main(String []args)
		{

			 i1 obj=new Subclass();
			 i2 obj1=new Subclass();
			 obj.show();
			 obj1.display(); 
		}

}