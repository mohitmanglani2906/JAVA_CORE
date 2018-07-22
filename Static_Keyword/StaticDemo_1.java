// Use of static block in java
class Demo
{

	static int  i,j; 												// only static variables can be used in static variable 
	public static void show()
	{
		System.out.println("Hello,world");
		System.out.println(i);
	}
	public static void dislay()
		{
			System.out.println("In the Display  : ");
			System.out.println(i+j);

		}

}
class StaticDemo_1
{

	public static void main(String []args)
	{

		
		Demo.i=3;    // here we are not creating any object
		Demo.show();      //calling more than one method in  main method 
		Demo.j=56;
		Demo.dislay();
	}


}