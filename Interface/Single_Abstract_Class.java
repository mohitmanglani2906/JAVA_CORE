// Here we will implement type of interface that is Single abstract class(SAM) also known as Functional interface
// This feature of java is only available since java 1.8
// This is also known as lanbda function
interface i1
{
	void show();       // here only method can be  decalred as abstract in interface for using lambda function or SAM
}
class Single_Abstraction_Class
{
	public static void main(String []args)
		{
			/*i1 obj=new i1()
				{
					public void show()
						{
							System.out.println("IN show");
						}
				};*/
				i1 obj= () ->
					{
						System.out.println("In show");
					};
				obj.show();
		}
}