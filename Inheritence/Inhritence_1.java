//Demo of Inheritence in java which do not support Multile Inheritence // Single inheritence
class SuperClass
{
	public SuperClass()
		{
			System.out.println("In SuperClass const ");  //default constructor of a Superclass
		}
	public SuperClass(int i)
		{
			System.out.println("In SuperClass int ");    //constructor of a Superclass with parameter
		}
}

class SubClass extends SuperClass
{
	public SubClass()
		{	
			//super(); This is a hidden super class Which calls the default constructor of Superclass
			System.out.println("In SubClass const ");   //default constructor of a Subuclass
		}
		
	public SubClass(int i)
		{	
			//super(7); if you want to call parametrized constructor then write super(value);
			System.out.println("In SubClass int ");  	//constructor of a Subclass with one parameter
		}
}


class Inhritence_1
{
	public static void main(String []args)
		{
			SubClass s1=new SubClass(); 
			SubClass s2=new SubClass(3);   // what if I am calling SubClass constructor guess the output???
		}								  // what if I am calling SubClass constructor guess the output???
}									// A Superclass default constructor is automatically called






