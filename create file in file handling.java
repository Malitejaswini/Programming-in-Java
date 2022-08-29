//Program to create file in file handling.
import java.io.*;
class fh
{
   public static void main(String args[])
   {
      File f=new File("hello.txt");
      try
      {

		  if(f.createNewFile())
		  {
			  System.out.println("File Succesfully Created....");
		  }
		  else
		  {
			  System.out.println("File Already Exist...");
		  }
	  }
	  catch(IOException i)
	  {
		  System.out.println("Exception Handeld....");
      }
   }
}
