// MArker interface in java is used to give the permissions to object of the classes which implements the interface
interface Permission
{


}
class Demo implements Permission
{
	void show()
	{
		System.out.println("Yes permissions granted : ");
	}
}
class Marker_Interface
{
	public static void main(String []args)
		{
			Demo d=new Demo();
			if(d instanceof Permission)	d.show(); 	// keyword instanceof is used to check weather
													// the class implements the interface or not
			else System.out.println("No sorry we can't do this: ");
		}
}