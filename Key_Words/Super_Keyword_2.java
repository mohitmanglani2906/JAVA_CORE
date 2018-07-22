class Super_Keyword_2
{
	public static void main(String []args)
		{
			SubClass s1=new SubClass();
			s1.show();

		}
}
class SuperClass
{
	int i=1;
}
class SubClass extends SuperClass
{
	int i=56;
	void show()
		{
			System.out.println(super.i); // This will print the value of a variable i in superclass that's why we use super keyword for variable 
			System.out.println(i);       // This will print the value of a variable i in subclass
		}
}