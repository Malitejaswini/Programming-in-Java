import java.util.*;
abstract class A
{
	int a=5,b=6;
	abstract void abs();
}
class B extends A
{
	void abs()
	{
		int c=a+b;
		System.out.println("Addition is:-"+c);
	}
}
class abstractc
{
	public static void main(String args[])
	{
		B b=new B();
		b.abs();
	}
}