// Reason why we can't use non-static value in static method
class Demo
{

 int num1;
public static void display()

{
	num1++;
	System.out.println(num1);
}

}
class StaticDemo_3
{
	public static void main(String []args){

			Demo d1=new Demo();
	Demo d2=new Demo();
	Demo d3=new Demo();
	
	d1.num1=4;
	d1.num1=5;
	d1.num1=8;
	Demo.display();

	}
	
	










}