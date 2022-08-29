//Program to get information about file in file handling.
import java.io.*;
class finfo
{
   public static void main(String args[])
   {
      File f=new File("hello.txt");

		  if(f.exists())
		  {
			  System.out.println("File Name:- "+f.getName());
			  System.out.println("File Location:- "+f.getAbsolutePath());
			  System.out.println("File Name:- "+f.canWrite());
			  System.out.println("File is Readable?:- "+f.canRead());
			  System.out.println("File Size:- "+f.length());
		  }
		  else
		  {
			  System.out.println("File Does not Exist...");
	      }
   }
}
