// here we will see map method of Stream api which is used to reduce the operation

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.stream.Stream;




class Stream_Map_Method
{
    public static void main(String[] args)  throws Exception{
        List<Integer> values=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
      //  System.out.println(values.stream().map(i->i*2).reduce(0,(c,e)->c+e)); // But  how is this possible we will see in deep
      //  Integer result=0;
       /* Function<Integer,Integer> f=new Function<Integer,Integer>()
        {
            public Integer apply(Integer i)
            {
                return i*2;
            }
        };*/

       /* BinaryOperator<Integer> b=new BinaryOperator<Integer>() {
            public Integer apply(Integer i,Integer j)
            {
                return i+j;
            }
        };*/
 
        /***************************Converting to Lambda Expression*********************************/       
      /*  Stream s=values.stream();
        Stream s1=s.map(new Function<Integer,Integer>()
        {
            public Integer apply(Integer i)
            {
                return i*2;
            }
        });
        Integer result=(Integer)s1.reduce(0,new BinaryOperator<Integer>() {
            public Integer apply(Integer i,Integer j)
            {
                return i+j;
            }
        });*/

        /*****************************Using Functionl Interface**********************************************************************/
       /* Stream<Integer> s=values.stream();
        Stream<Integer> s1=s.map(i -> i*2);
        Integer result=(Integer)s1.reduce(0,(i,j)->i+j);
        */

       /* Merging above three lines */

       Integer result=values.stream().map(i->i*2).reduce(0,(i,j)->i+j);
        System.out.println(result);

     }
}