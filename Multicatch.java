class Multicatch
{
	public static void main(String args[])
    {
		try
		{
			int a=args.length;
			System.out.println("a= "+a);
			int b=42/a;
			int c[]=new int[5];
			c[42]=99;
		}
		catch(ArithmeticException e)
		{
			System.out.println("Divided by 0:"+e);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Array index oob:"+e);
		}
		System.out.println("After try/catch blocks.");
	}
}