import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;


// Here we will discuss strema api which is the new feature of java language

class For_Each_Method
{
    public static void main(String[] args) 
    {
        List<Integer> values=Arrays.asList( 1,2,3,4,5);


        /****************** Method 1 ************/
       /* Consumer<Integer> c= new Consumer<Integer>()  // Consumer is a Functional interface that is why we can implement its 
        {                                              //accept method using this code         
            public void accept(Integer i)
            {
                System.out.println(i);
            }
        };
        values.forEach(c);*/

        
        /**************** Method 2****************/
        // We can use lambda expression to excecute above code like this

        /*Consumer <Integer> c=(Integer i)->System.out.println(i); 
        values.forEach(c);*/



        /**************** Method 3 ****************/
        // Here c equal to we can write (Integer i)->System.out.println(i);

        values.forEach((Integer i)->System.out.println(i));
                     /* |
                        |
                        |
                        |
                        V  */

        // we can use below line that is used to exceute above code
       // values.forEach(i->System.out.println(i));   

    }
}