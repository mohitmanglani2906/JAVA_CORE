// USe of Anonymous object in java

class UseAnonymous{

	int k;
	void show()
		{
			System.out.println(k);
		}
	void display()
		{
			System.out.println("In a display method ");
		}	
}
class Anonymous_Object
{
		public static void main(String []args)
			{
				UseAnonymous a=new UseAnonymous();
				a.k=34;           				// This will occupy a memory in a stack as well as in heap memory
				a.show();						// This will also occcupy a memory in a stack as well as in heap memory
				new UseAnonymous().display();	// Now  suppose I want to use show method only once then I will use Anonymous object
				new UseAnonymous().show();     	// Now guess the output // 34 or 0???
												// 0 because this time it will create a new object
			}

	







}
