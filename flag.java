 import java.applet.Applet;
 import java.awt.*;
 public class flag extends Applet
 {
 	public void paint(Graphics g)
	{
		g.fillRect(150,150,15,400);
		g.setColor(Color.gray);
		g.fillOval(110,550,100,30);
		g.fillOval(95,570,130,30);
		g.setColor(Color.orange);
		g.fillRect(165,150,100,40);
		g.setColor(Color.white);
		g.drawRect(165,190,100,40);
		g.setColor(Color.green);
		g.fillRect(165,230,100,40);
	}
}