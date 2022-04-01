import java.util.Scanner;
class gcube
{
	Scanner sc=new Scanner(System.in);
	int a;
	void read()
	{
		System.out.print("Enter no to get cube:");
		a=sc.nextInt();
	}
	void display()
	{
        System.out.println("Cube of" +a+ "is:"+a*a*a);
	}
}
class getcube
{
	public static void main(String args[])
	{
		gcube p1=new gcube();
		p1.read();
		p1.display();
    }
}