import java.util.*;
class fibonacci
{
	public static void main(String args[])
	{
		int n,n1=0,n2=1,n3=2;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no:- ");
		n=sc.nextInt();
		System.out.println(n1);
		System.out.println(n2);
		{
			for(int i=1;i<=n;i++)
			{
				n3=n1+n2;
				System.out.println(n3);
				n1=n2;
				n2=n3;
			}
		}
	}
}