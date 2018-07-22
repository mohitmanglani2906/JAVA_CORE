import java.util.Scanner;
import java.util.Random;
class Array{
		public static void main(String []args){
			int a[]=new int[20];
			Scanner s=new Scanner(System.in);
			Random r=new Random(); // takev value randomly
			System.out.println("Enter an elements : ");
			for(int i=0;i<a.length;i++)
			{
				a[i]=r.nextInt(50);

			}
				for(int i:a){ // enhanced for loop
						System.out.println(i);
				}
			


		}
	

}