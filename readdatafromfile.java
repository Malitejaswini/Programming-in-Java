// Program to read data from file in file handling.
import java.io.*;
class filer
{
   public static void main(String args[])
   {
	  try
      {
          FileReader r=new FileReader("C:\\Users\\IMRD\\Desktop\\hii.txt");
		  try
		  {
			  int i;
			  while((i=r.read())!=-1)
			  {
				  System.out.println((char)i);//only i prints ascii values thats why we type caste it...
			  }
		  }
		  finally
		  {
			  r.close();
	      }
	  }
	  catch(IOException i)
	  {
		  System.out.println("Exception Handeld....");
      }
   }
}
