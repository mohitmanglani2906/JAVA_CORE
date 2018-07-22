// Metho dispathc, Run time polymorphisam
class SuperClass
{
		void show()
		{
			System.out.println("In show a");
		}
	
}
class SubClass extends SuperClass
{
	void show()
		{
			System.out.println("In show b");
		}
}
class Method_Dispatch
{
	public static void main(String []args)
		{
			SubClass s2=new SubClass();
			SuperClass s3;         // Refernce of a superclass
			s3=s2;                 // convert s2 into s3 
			s3.show();           	// why we need this because refernce doen not occupy space in a memory
		}
}