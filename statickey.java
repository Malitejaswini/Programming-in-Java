import java.util.Scanner;
class c1
{
	int a;
	static String b="IMRD";
}
class statickey
{
	public static void main(String args[])
	{
		c1 obj=new c1();
		obj.a=4;
		System.out.println(obj.a);
		System.out.println(c1.b);
	}
}
