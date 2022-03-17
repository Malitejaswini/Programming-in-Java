interface demo
{
	void input();
	void show();
}
class interfaceinh implements demo
{
	int a,b,c;
	public void input()
	{
		a=3;
		b=5;
	}
	public void show()
	{
		c=a+b;
	}
	public void display()
	{
		System.out.println(c);
	}
	public static void main(String args[])
	{
		interfaceinh t=new interfaceinh();
		t.input();
		t.show();
		t.display();
	}
}


