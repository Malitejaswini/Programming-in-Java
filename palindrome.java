import java.util.*;

 class palindrome
 {
   public static void main(String args[])
   {
     Scanner sc = new Scanner(System.in);
int a,b,c,d,s;
System.out.println("Enter First Number:");
     a=sc.nextInt();
     s=a;
     c=0;
     while (a>0)
     {
     b=a%10;
     c=(c*10)+b;
     a=a/10;
     }
     if(s==c)
     {
System.out.println("number is palindrome");
     }
     else
     {
System.out.println("number is not palindrome");
     }
   }
 }
