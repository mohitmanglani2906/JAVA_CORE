// Method overriding, Dynamic Binding,late biding,Run time polymorpisham
class SuperClass
{
			public void show()
		{
			System.out.println("In a SuperClass ");
		}

}
class SubClass extends SuperClass 
{
		public void show()
			{
				System.out.println("In a Sub Class ");
			}

}
class Method_Overiding
{
	public static void main(String []args)
	{
		SubClass s1=new SubClass();
		s1.show();        // Guess which method , this object will call Superclass or Subclass?
							// According to type of object method will be called
	}
	

}





/*Output:
		In a Sub Class	
*/