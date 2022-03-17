class cdemo
{
	void read()
	{
		System.out.println("read no");
	}
	void read(int x)
	{
		System.out.println(x);
	}
}
	class moverloading
	{
		public static void main(String args[])
		{
		 cdemo m=new cdemo();
			m.read();
			m.read(6);
		}
	}