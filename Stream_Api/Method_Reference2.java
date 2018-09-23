// Here we will see how to use Method reference that is made by user


interface Parser
{
	String parse(String str);
}

class StringParser
{
	public String convert(String s)
	{
		if(s.length()<3)
			s=s.toUpperCase();
		else
			s=s.toLowerCase();

		return s;
	} 
}

class MyPrinter
{
	public void print(String str,Parser p)
	{
		str=p.parse(str);
		System.out.println(str);
	}
}

class Method_Reference2
{
	public static void main(String []args)
	{
		StringParser sp=new StringParser();
		String str="Mohit Manglani";
		MyPrinter mp=new MyPrinter();
		/*mp.print(str,new Parser()   // Anonoumous Class
			{
				public String parse(String s)
				{
					return StringParser.convert(s);
				}
			});*/

			//mp.print(str,(String s)->StringParser.convert(s)); // Lambda Expression

			mp.print(str,sp::convert);  // This is called method reference
	}
}