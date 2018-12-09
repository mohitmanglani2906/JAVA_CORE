/*It is required to compute SPI (semester performance index) of n students of a
class for their registered subjects in a semester.
Assume that all students register for 6 subjects and each subject carry 5 credits. 
Also, follow GTU convention and method for computation of SPI. 
Declare a class called student having following data members: 
id_no, grades_obtained and spi. 
Define constructor, display and calculate_spi methods. Define main to process data of n students */


package gtupapers;

import java.util.Scanner;


class Stu
{
	int id_no[]=new int[20];
	int g[]=new int[20];
	double spi[]=new double[20];
	String name[]=new String[20];
	Scanner s=new Scanner(System.in);
	
	void get_data(int i)
	{
		System.out.println("Enter name and id of student : ");
		name[i]=s.next();
		id_no[i]=s.nextInt();
	}
	double calculate_spi()
	{
		double s=0;
		for(int i=1;i<=6;i++)
			{
                            s=s+(5*g[i]);
			}
		return s/30;
	}
	void display(int l)
	{
		System.out.println("Name of a student :" + name[l]);
		System.out.println("SPI :" +spi[l]);
		System.out.println("id_no :" + l);
	}
}
class C216
{
	public static void main(String args[])
	{
		Stu s1=new Stu();
		Scanner s=new Scanner(System.in);
		for(int k=1;k<=3;k++)
		{
                    s1.get_data(k);
		}
		for(int i=1;i<=3;i++)
		{
			System.out.println("Enter grades  :");
			for(int j=1;j<=6;j++)
			{
				s1.g[j]=s.nextInt();
					
			}
			 s1.spi[i]=s1.calculate_spi();	   
		}
		for(int l=1;l<=3;l++)
		{
			s1.display(l);
		}
	}
				
}
