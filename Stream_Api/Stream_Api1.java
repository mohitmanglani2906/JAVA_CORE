import java.util.Arrays;
import java.util.List;

// Here we will see that how we can use Stream api which is the new feature og the jdk 8 and most intersting part of the java

class Stream_Api1
{
    public static void main(String[] args) {
        List<Integer> values=Arrays.asList(1,2,3,4,5,6,7,8);

        values.stream().forEach(System.out::println); System.out.println("");
        
        values.parallelStream().forEach(System.out::println);  // this will give you random values and provides you multiple threads 
                                                                //simuntenously according to your core
    } 
}