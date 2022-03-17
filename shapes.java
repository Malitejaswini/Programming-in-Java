import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
public class shapes extends Applet
{
	public void paint(Graphics g)
	{
	g.setColor(Color.red);
	g.drawOval(50,50,100,100);
	g.drawRect(150,150,100,100);
	g.drawLine(40,50,40,200);
    }
}
