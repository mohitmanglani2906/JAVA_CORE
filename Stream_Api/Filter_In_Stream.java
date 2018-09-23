// Here we will see how to use filter method using stream api
import java.util.Arrays;
import java.util.List;


class Filter_In_Stream
{
    public static void main(String[] args) {
        List<Integer> values=Arrays.asList(12,20,35,46,55,68,75);
      /*  int result=0;
        for(int i:values)
        {
            if(i%5==0)
            {
                result=result+i*2
            }
        }
        System.out.println(result);*/

        /************We can do above task as follows using filter*********/
        /************This is more faster than above method****************/

        Integer result=values.stream()
                        .filter(Filter_In_Stream::isDivisible)
                        .map(Filter_In_Stream::mapDoubleit)
                        .reduce(0,(i,j)->i+j);
        System.out.println(result);
    }
    public static boolean isDivisible(int i)
    {
        System.out.println("In divisible" + i);
        return i%5==0;
    }
    public static int mapDoubleit(int i)
    {
        System.out.println("In mapdouble " +i);
        return i*2;
    }
}