// Demo of encapsulation
class Demo
{

	 private int i;         // variable is private that's why can't be accesible out side the class defination
	 public void setI(int j) // Methods setI and getI are public so can be accesible out side the class defination
	 	{
	 		i=j;
	 	}
	 public int getI()
	 	{
	 		return i;
	 	}



}

class Encapsulation_1
{


	public static void main(String []args)
		{
			Demo d=new Demo();                  //d.i=12; -----> you will find an error
			d.setI(1000);
			System.out.println(d.getI());

		}

}