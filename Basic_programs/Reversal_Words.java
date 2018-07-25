import java.util.Scanner;
class String_Demo
{
	String str;
	void show()
		{
			System.out.print("Before reversal : ");
			System.out.println(str+ "\ns");
			System.out.print("After reversal : ");
		}
}
class Reversal_Words
{
	public static void main(String []args)
		{
			Scanner s=new Scanner(System.in);
			String_Demo d1=new String_Demo();
			String s2=" ";
			System.out.println("Enter your string ");
			String s1=s.nextLine();
			d1.str=s1;
			String s3=s2+s1;
			d1.show();
			int cnt=0,j=0;
				for(int i=s3.length()-1;i>=0;i--)
					{
						
						char tch=s3.charAt(i);
						if(tch!=' ')
							{
								cnt++;
								j=i;	
							} 
						else
						{
							while(cnt>0)
							{
								char ch=s3.charAt(j++);
								System.out.print(ch);
								cnt--;
							}
							System.out.print(" ");
							cnt=0;
						}
					}			
		}
	
}
