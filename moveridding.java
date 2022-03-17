import java.util.*;
class c1
{
	void run()
	{
		System.out.println("vehicle is running");
	}
}
class c2 extends c1
{
	void run()
	{
		System.out.println("Bike is running safely");
	}
}
class moveridding
{
	public static void main(String args[])
	{
		c2 obj=new c2();
		obj.run();
	}
}