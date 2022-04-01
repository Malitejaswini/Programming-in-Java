public class CopyStudent
{
	int roll;
	String name;
	CopyStudent(int rollNo,String sName)
	{
		roll=rollNo;
		name=sName;
	}

CopyStudent(CopyStudent student)
{
	System.out.println("\n Copy constructor invoked");
	roll=student.roll;
	name=student.name;
	System.out.println("Roll number="+roll);
	System.out.println("Name="+name);
}

public static void main(String args[])
{
	CopyStudent s1=new CopyStudent(53,"Tejaswini");
	CopyStudent s2=new CopyStudent(s1);
}
}