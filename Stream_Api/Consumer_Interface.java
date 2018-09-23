// Here we will see Consumer interface which is FunctionalInterface
//In any Functional interface there can be only one method defined
//Moreover we will see forEach() method which accepts the Object of Consumer interface

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Arrays;

class Consumer_Interface
{
	public static void main(String []args) throws Exception
	{
		List<Integer> values=Arrays.asList(1,2,3,4,5,6);

		Consumer<Integer> c=new Consumer<Integer> ()
		{
			public void accept(Integer i)
			{
				System.out.println(i);
			}
		};
		values.forEach(c);  			// Internal  iteration
		//values.forEach(i->System.out.println(i));  // we can implement like this also the above code from 16 to 24 
													// this is calles lambda expression
 

	}
	
}