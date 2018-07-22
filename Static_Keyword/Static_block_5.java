// static block in java
import static java.lang.System.out;
class Demo
{

}
class Static_block_5
{

	static
	{
		out.println("in static 1");      // all the static blocks are loaded first then compiler will load main method
	}
	public static void main(String []args)
		{

			out.println("Hello world");
		}
		static
	{
		out.println("in static 2");
	}
}
				//Output: 
				/*in static 1
				in static 2
				Hello world*/