import java.util.*;
public class table1
{
public static void main(String args[])
{
 int a,t,i;
 Scanner  sc=new Scanner(System.in);
 System.out.print("Enter no to print table:");
 a=sc.nextInt();
 for(i=1;i<=10;i++)
 {
   t=a*i;
   System.out.println(t);
 }
}
}