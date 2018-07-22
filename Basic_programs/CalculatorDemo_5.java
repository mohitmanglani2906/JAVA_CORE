// basic calculator using switch case and do.. while loop
import java.util.Scanner;
class Calculator{
	int n1,n2;
	void sum(){
		int s=n1+n2;
		System.out.println("The sum is : ");
		System.out.println(s);
	}
	void mul(){
		int m=n1*n2;
		System.out.println("The multipication is ");
		System.out.println(m);
	}
	void div(){
		float d=n1/n2;
		System.out.println("The division is ");
		System.out.println(d);
	}
	void sub(){
		int sub=n1-n2;
		System.out.println("The substractio is : ");
		System.out.println(sub);
	}
}
class CalculatorDemo_5{
	 public static void main(String[] args) {
		
	
	
	Calculator c=new Calculator();
	Scanner S=new Scanner(System.in);
	
	//char sch;
	int ch;
		System.out.println("1. sum 2. mul 3.div 4.sub");
		System.out.println("Enter option : ");
		ch=S.nextInt();
		
	do{
		
		System.out.println("Enter a : ");
		int a=S.nextInt();
		System.out.println("Enter b : ");
		int b=S.nextInt();
			c.n1=a;
			c.n2=b;

		switch(ch){
		case 1:
			c.sum();
			break;
		case 2:
			c.mul();
			break;
		case 3:
			c.div();
			break;
		case 4:
			c.sub();
			break;
		default:
			System.out.println("Wrong option ");
			}
			System.out.println("1. sum 2. mul 3.div 4.sub");
			System.out.println("Enter option : ");
			ch=S.nextInt();
	}while(ch!=5);
	}
}
























