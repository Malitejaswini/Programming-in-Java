import java.util.*;
class exception
{
	public static void main(String args[])
	{
		int b=30;
		try
		{
			int a=args.length;
			System.out.println("a="+a);
			b=b/a;
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
	}
}