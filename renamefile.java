//Program to rename file in file handling in java.
import java.io.File;
class renamefile
{
	public static void main(String args[])
	{
		File f=new File("F:\\hello.txt");
		File r=new File("F:\\hii.txt");
		if(f.exists())
		{
			System.out.println(f.renameTo(r));
		}
		else
		{
			System.out.println("File is not exist..");
		}
	}
}
