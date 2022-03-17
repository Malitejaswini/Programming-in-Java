class c1
{
	int a,b,c;
	void read()
	{
		a=2;
		b=3;
	}
}
class c2 extends c1
{
	void show()
	{
		c=a+b;
		System.out.println(c);
	}
}
class singleinhe
{
	public static void main(String args[])
	{
		c2 t=new c2();
		t.read();
		t.show();
	}
}
