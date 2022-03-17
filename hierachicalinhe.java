/* Que  :-  Write a java program to solve the following structure by using hierachical inheritance.

                                A (read a,b)
                                |
                          -------------
                          |           |
  (Check a is palindrome  B           C(to print factorial of b)
        or not)
   Name   :-  Mali Tejaswini Ravindra
   Class  :-  SYBCA(A)
   Roll No:-  53   */

import java.util.*;
class c1
{
	int a;
	int b;
	Scanner sc=new Scanner(System.in);
	void read_1()
	{
	   System.out.println("Enter the no to check whether it is palindrome or not:- ");
	   a=sc.nextInt();
	}
	void read_2()
	{
		System.out.println("Enter no to print factorial of that number:- ");
	    b=sc.nextInt();
	}
}
class c2 extends c1
{
	int r,s,c;
	void show()
	{
		s=0;
		c=a;
		while(a>0)
		{
			r=a%10;
			s=(s*10)+r;
			a=a/10;
		}
		if(c==s)
		{
			System.out.println("Number is palindrome");
		}
		else
		{
			System.out.println("Number is not palindrome");
		}
	}
}
class c3 extends c1
{
	void display()
	{
		int i, f=1;
	    for(i=1;i<=b;i++)
	    {
			f=f*i;
	    }
	    System.out.println("Factorial of " +b+ " is:- "+f);
    }
}
class hierachicalinhe
{
	public static void main(String args[])
	{
		c2 obj=new c2();
		c3 rt=new c3();
		obj.read_1();
		obj.show();
		rt.read_2();
		rt.display();
	}
}