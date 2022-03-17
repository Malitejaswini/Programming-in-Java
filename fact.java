import java.util.*;
public class fact
{
	public static void main(String args[])
	{
		int n,i,fact=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Eter the no:- ");
		n=sc.nextInt();
		for(i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		System.out.println("Factorial of "+n+" is "+fact);
	}
}