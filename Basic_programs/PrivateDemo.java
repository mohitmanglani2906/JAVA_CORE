package se.javamodifiers;

public class PrivateDemo {
	private int b=20;
	private void method1(){
		System.out.println(b);
		
	}
	
	public static void main(String[] args) {
		PrivateDemo pd= new PrivateDemo();
		pd.method1();
	
	}

}
class Test {
	public static void main(String[] args) {
	PrivateDemo pd= new PrivateDemo();
	pd.method1();// Here we cannot access private method
}
}