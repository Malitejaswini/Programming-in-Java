public class Armstrong1
{
public static void main(String[] args)
{
int num=371,origno,rem,res=0;
origno=num;
while(origno !=0)
{
rem=origno % 10;
res += Math.pow(rem ,3);
origno /=10;
}
if(res == num)
System.out.println(num +"is an Armstrong number");
else
System.out.println(num +"is not an Armstrong number");
}
}