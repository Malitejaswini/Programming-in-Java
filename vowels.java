import java.util.Scanner;
class vowels
 {
   public static void main(String args[])
   {
      int v=0;
      System.out.println("Enter a sentence :");
      Scanner sc = new Scanner(System.in);
      String vowel=sc.nextLine();
      for (int i=0 ; i<vowel.length(); i++)
      {
         char chr = vowel.charAt(i);
         if(chr == 'a'|| chr == 'e'|| chr == 'i' || chr == 'o' || chr == 'u')
          {
            v++;
         }
      }
      System.out.println("Number of vowels in the given sentence is "+v);
   }
}