//Program to copy data from one file to another in file handling.
import java.io.*;
class copyfile
{
	public static void main(String args[]) throws IOException
	{
		FileInputStream r=new FileInputStream("F:\\hello.txt");
		FileOutputStream w=new FileOutputStream("F:\\hii.txt");
		int i;
		while((i=r.read())!=-1)
		{
			w.write((char)i);
		}
		    System.out.println("Data Copied Succesfully..!");
	}
}
