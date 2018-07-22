import java.util.Scanner;
class String_Demo
{
	String str;
	void show()
		{
			System.out.println(str);
		}
}
class Reversal_Words
{
	public static void main(String []args)
		{
			Scanner s=new Scanner(System.in);
			String_Demo d1=new String_Demo();
			System.out.println("Enter your string ");
			String s1=s.nextLine();
			d1.str=s1;
			d1.show();
			int cnt=0,j=0;
				for(int i=s1.length()-1;i>=0;i--)
					{
						
						char tch=s1.charAt(i);
						if(tch!=' ')
							{
								cnt++;
								j=i;	
							} 
						else
						{
							while(cnt>0)
							{
								char ch=s1.charAt(j++);
								System.out.print(ch);
								cnt--;
							}
							System.out.print(" ");
							cnt=0;
						}
					}			
		}
	
}