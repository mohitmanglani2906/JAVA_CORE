class Pattern1{
	public static void main(String []a)
		{
			loop:
			for(int i=0;i<5;i++){
				for(int j=0;j<5;j++){
					if(i==3)break loop; // labeled break;
					System.out.print("* ");
				}
				System.out.println(" ");
			}

		}


}
