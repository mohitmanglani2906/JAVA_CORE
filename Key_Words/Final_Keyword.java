class Final_Keyword
{
	public static void main(String []args)
		{
			
			final int i=22;
				System.out.println(i);
			//i=45;     // Error // The value of int i can't be changed as it is declared as final 
				SubClass s2=new SubClass();
				s2.show();

 

		}
}
class SuperClass
{ 
	final void show()
		{
			System.out.println("In a SuperClass");
		}
}
class SubClass extends SuperClass
{
	void show()
		{
			System.out.println("In a SubClass");
		}

}