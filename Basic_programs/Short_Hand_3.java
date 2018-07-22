class Short_hand_3{
	public static void main(String []args){
		byte b=8;
												//b=(byte)b*2.5; lossy conversion
		b *=2.5;                               // e1 op e2 // always converts into expression1(e1) type
		int i=0B100_00_00_00_00;        // hexadecimal value can be intiliazed in interge separated by '_'
		System.out.println(i);
		System.out.println(b);                               
		double d=13.4;
		int a=12;
		a*=d; 										// converts double into interger
		d*=a; 										// converts integer into double
		System.out.println(a);
		System.out.println(d);
		
}
}