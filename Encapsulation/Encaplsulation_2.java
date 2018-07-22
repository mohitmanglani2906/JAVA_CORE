// Demo of encapsulation in java
class Emp
{	
	private int empid;
	private String empname;
		public void setId(int empid)
			{
					this.empid=empid;;	
			}
		public void setName(String empname)
			{
				this.empname=empname;
			}

		public int getID()
			{
				return empid;
			}
		public String getName()
			{
				return empname;
			}	

}
class Encaplsulation_2
{

	public static void main(String []args)
		{	

			Emp e1=new Emp();
			Emp e2=new Emp();
			e1.setId(4);
			e1.setName("Mohit");
				System.out.println("The employee id is: " + e1.getID());
				System.out.println("The employee name is: " + e1.getName());
			
				/*
				e2.empid=34;
				e2.empname="mohit";             // you will get error as private variablea can't be accessed outside the claa defination directly
				*/

				









		}

}