// Program to insert data into file in file handling
import java.io.*;
class fh
{
   public static void main(String args[])
   {
	  try
      {
          FileWriter f=new FileWriter("C:\\Users\\IMRD\\Desktop\\hii.txt");
		  try
		  {
			  f.write("File Handling in java programming......");
		  }
		  finally
		  {
			  f.close();
		  }
		  System.out.println("Data inserted into file......");
	  }
	  catch(IOException i)
	  {
		  System.out.println("Exception Handeld....");
      }
   }
}
