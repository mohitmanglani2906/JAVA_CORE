//Here we will see how enum works in java language
//It differes from c and c++ such that in this we can implement method and constructor in enum block
//The constants of the enum behaves as static and final variables of class with the name as enum
// enum extends Enum class
// enum block can implement interface but can't extend any class as it already extends Enum class
interface Demo
{
	
}
enum Mobile implements Demo
{
	APPLE(56000),SAMSUNG,HTC,NOKIA(12000);

	int price;
	Mobile()		 // default constructor will be called automatically 3 times as we have 3 constants // 1 APPLE(56000)
	{					
		price=80;
		System.out.println("Constructor");
	}
	Mobile(int price)
	{
		this.price=price;
	}
	public int getPrice()
	{
		return price;
	}

	public void show_data(Demo d)
	{
		System.out.println(d);
	}
}

/*  
	//this block is created automatically when we create any enum block
	class Mobile
	{
		static final Mobile APPLE=new Mobile();
		static final Mobile SAMSUNG=new Mobile();
		static final Mobile HTC=new Mobile();
		static final Mobile NOKIA=new Mobile();
	}
*/
class EnumExample
{
	public static void main(String []args)
	{
		System.out.println(Mobile.APPLE.getPrice());
		System.out.println(Mobile.APPLE.ordinal());     // ordinal() method gives the constant assigned with the
														// enum elements // ordinal() is from Enum class 
		Mobile m[]=Mobile.values(); // The values() method stores the elements of the enum in an array
		for(Mobile mobile:m)		// But this method doesnot belong Enum class it is provided by JVM
		{
			System.out.println(mobile +  " " + mobile.getPrice());
		}
		
		Demo d1=new Mobile();
		d1.show_data(d1);

	}



}