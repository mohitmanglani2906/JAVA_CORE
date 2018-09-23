// Abstraction in  java using Inheritence
abstract class Phone 
{
	public abstract void showConfig(); // abstract method should be in  abstract class 
		
}
class Iphone extends Phone
{
	public void showConfig()
		{
			System.out.println("2 gb, IOS  9.3");
		}
}
class Samsung7 extends Phone
{
	public void showConfig()
		{
			System.out.println("Octa core , Lolipop");
		}
}
class Abstraction_In_Java
{
	public static void main(String []args)
		{
			Iphone obj=new Iphone();
			Samsung7 obj1=new Samsung7();
			show(obj);    // will call showConfig method in iphone class // here we use the concept that object of subclass and reference of another class4
			show(obj1);   // will call showConfig method in samsung7 class
		}
	public static void show(Phone obj)   // static method because show method is shared by Samsung7 class and Iphone class
		{
			obj.showConfig();
		}
}
 	