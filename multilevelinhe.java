     import java.util.*;
     class s1
     {

		 	int a;
		 	void read_s1()
		 	{
		 		a=43;
	        }

	 }
	 class s2 extends s1
	 {

		 	int b;
		 	void read_s2()
		 	{
		 		b=30;
		 	}
	 }
	 class s3 extends s2
	 {

		 	int c;
		 	void display()
		 	{
		 		c=a+b;
		 		System.out.println(c);
	        }
	 }
	 class multilevelinhe
	 {
		 public static void main(String args[])
		 	{
		 		s3 ob1=new s3();
		 		ob1.read_s1();
		 		ob1.read_s2();
		 		ob1.display();
		 	}
	 }