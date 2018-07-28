// Here we will see what is the wrapper class in java
// primitive data types: int,float,char,double
// classes: Integer,Charcter.Float,Double
// I will demostrate  here for Interger class
import java.util.ArrayList;
class Wrapper_Class
{
	int i;
	Integer ii=new Integer(i);  // boxing 
	Integer jj=i;                // Autoboxing
	int j=ii.intValue();        // Unboxing
	int k=jj;                // Autounboxing
	ArrayList<Integer> values=new ArrayList<Integer>();
	values.add(5);

}