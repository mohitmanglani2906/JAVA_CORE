class This_Keyword
{
	public static void main(String []args)
		{
			Demo d=new Demo();
			//d.x=4;     // error // because variable x is private
			d.show();
		}




}
class Demo
{
	private int x; // instance // therefore can be  used within the class only as x is private
	public Demo(int x)
		{
			this.x=x;    // this keyword is used to take the invoked value
		}
	void show()          //This method can be  used to show the variable x as it is within the class
		{
			System.out.println(x);
		}	




}