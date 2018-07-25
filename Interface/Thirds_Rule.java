// To prove that class has more power that interface we do the following program
// This is called as a thirdsrule
interface i1
{
	default void show()
		{
			System.out.println("In show interface");
		}
}
class i2 implements i1
{
	public void show()
		{
			System.out.println("In show class");
		}
}
class Thirds_Rule
{
	public static void main(String []args)
		{
			i2 obj=new i2();
			obj.show();
		}
}