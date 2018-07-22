// swapping in 3 different way in java 
class Swap_4
{	
	public static void main(String []args){

		int a=12;
		int b=5;

					System.out.println("***************1st method : *****************");
					System.out.println("Before swapping : "+ "a= " + a + "b= " + b);
					
		int temp=a;
		a=b;
		b=temp;
					System.out.println("After swapping : " + "a= " + a +  "b= " +b);

					System.out.println("***************2nd method : *****************");
		int c=4,d=67;
					System.out.println("Before swapping : "+ "c= " + c + "d= " + d);
		c=c+d-(d=c);
					System.out.println("After swapping : " + "c= " + c + "d= " + d );

					System.out.println("***************3rd method : *****************");

		int e=34,f=45;
					System.out.println("Before swapping : "+ "e= " + e + "f= " + f);
		e=e^f;
		f=e^f;
		e=e^f;
					System.out.println("After swapping : "+ "e= " + e + "f= " + f);	







						
	}

}