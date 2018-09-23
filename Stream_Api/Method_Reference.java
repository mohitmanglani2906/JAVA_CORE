import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

class Method_Reference
{
    public static void main(String[] args) 
    {
        List<Integer> values=Arrays.asList(1,2,3,4,5);

        
        /**************** Method 3 ****************/
        // Here c equal to we can write (Integer i)->System.out.println(i);

        //values.forEach((Integer i)->System.out.println(i));
        

        /**************** Method 4 ****************/
        values.forEach(System.out::println); // This is known as call by  method // Method reference
        System.out.print("\n");
        values.forEach(i->doubleit(i));
        System.out.print("\n");
        values.forEach(Stream_Api2::doubleit);  // This is knows as method reference
    }
    public static void doubleit(int i)
    {
        System.out.println(i*2);
    }

}
