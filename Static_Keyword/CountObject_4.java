// Static variable to count number of object..................
class Count
{
	static int count;          // Shared by all the object..................
	Count()
		{
			count++;
		}
	void display()
		{
			System.out.println("The number of object " + count);
		}	
}
class CountObject_4
{
	public static void main(String []args)
{
		Count c1=new Count(); c1.display();
		Count c2=new Count();c2.display();
		Count c3=new Count();c4.display();
		Count c4=new Count(); c4.display();
		
		

}

}