class Super_Keyword
{
	public static void main(String []args)
		{
			SuperClass s1=new SuperClass();
			SubClass s2=new SubClass(); 

		}
}
class SuperClass 					//super class
{
	SuperClass()
		{
			
			System.out.println("in Const a");
		}
}
class SubClass extends SuperClass 			//sub class
{
	SubClass()
		{
			//super();    // In a subclass there is always super method which calls superclass constructor , that is hidden
 			System.out.println("in Const b");
		}

}