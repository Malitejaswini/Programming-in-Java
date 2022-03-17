import java.awt.*;
public class awtcontrols
{
	awtcontrols()
	{
		Frame f=new Frame("Frame");

		Label l1=new Label("First Name:-");
		f.add(l1);

		TextField t1=new TextField(20);
		f.add(t1);

		Label l2=new Label("Last Name:-");
		f.add(l2);

		TextField t2=new TextField(20);
		f.add(t2);

		Button b1=new Button("Submit");
		f.add(b1);

		f.setLayout(new FlowLayout());
		f.setSize(300,400);
		f.setVisible(true);
     }
	public static void main(String args[])
	{
		awtcontrols a=new awtcontrols();
	}

}

