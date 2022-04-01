import java.io.*;
 class datais
 {
   public static void main(String args[])
   { 
     int i;
     DataInputStream d=new DataInputStream(System.in);
     for(i=1;i<=6;i++)
     {
       if(i==1)
       {
         System.out.println("45");
       }
       if(i==2)
       {
         System.out.println("89");
       }
       if(i==3)
       {
         System.out.println("122");
       }
       if(i==4)
       {
         System.out.println("452");
       }
       if(i==5)
       {
         System.out.println("5632");
       }
       if(i==6)
       {
         System.out.println("45221");
       }
     }
     
   }
 }