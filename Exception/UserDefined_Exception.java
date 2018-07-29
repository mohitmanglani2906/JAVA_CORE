// Here we will see user defined exception
class UserDefined_Exception
{
	public static void main(String []args)
		{
			int i=5;
			try
			{
				if(i<10)
				{
					throw new MyException("Errrrrrrror: ");
				}
			}catch(Exception e)
				{
					System.out.println(e);
				}
		}
}
class MyException extends Exception
{
	 MyException(String str)
	{
		super(str);
	}
}