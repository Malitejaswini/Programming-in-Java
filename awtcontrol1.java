/*  Name :- Mali Tejasini Ravindra
    Class:- SYBCA(A)
    Que  :- Demonstrate Employee Details form using AWT Controls  */

import java.awt.*;
class awtcontrol1
{
	awt1()
	{
		Frame f=new Frame("Employee Details");

        Label l1=new Label("Emp ID       :-");
        TextField t1=new TextField();
        Label l2=new Label("Emp Name:-");
        TextField t2=new TextField();
        Label l3=new Label("Address     :-");
        TextField t3=new TextField();
        Label l4=new Label("Contact No :-");
        TextField t4=new TextField();
        Label l5=new Label("Email          :-");
        TextField t5=new TextField();
        Label l6=new Label("Gender       :-");
        Checkbox c6=new Checkbox("M");
        Checkbox c7=new Checkbox("F");
        Button b1=new Button("Submit");
        Button b2=new Button("Reset");

        l1.setBounds(30,50,80,35);
        t1.setBounds(130,50,140,30);
        l2.setBounds(30,90,80,35);
        t2.setBounds(130,90,140,30);
        l3.setBounds(30,130,80,35);
        t3.setBounds(130,130,140,100);
        l4.setBounds(30,240,80,35);
        t4.setBounds(130,240,140,30);
        l5.setBounds(30,280,80,35);
        t5.setBounds(130,280,140,30);
        l6.setBounds(30,320,80,35);
        c6.setBounds(130,320,50,35);
        c7.setBounds(180,320,50,35);
        b1.setBounds(30,360,100,35);
        b2.setBounds(150,360,100,35);

        f.add(l1);
        f.add(t1);
        f.add(l2);
        f.add(t2);
        f.add(l3);
        f.add(t3);
        f.add(l4);
        f.add(t4);
        f.add(l5);
        f.add(t5);
        f.add(l6);
        f.add(c6);
        f.add(c7);
        f.add(b1);
        f.add(b2);

        f.setLayout(null);
		f.setSize(400,500);
		f.setVisible(true);
	}
	public static void main(String args[])
	{
		awtcontrol1 a=new awtcontrol1();
	}
}
