class Short_hand{
	public static void main(String []args){
		byte b=8;
		//b=(byte)b*2.5; loddy conversion
		b *=2.5; // e1 op e2 // always converts into expression1(e1) type
		int i=0B100_00_00_00_00;
		System.out.println(i);
		System.out.println(b);
		
}
}