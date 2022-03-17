import java.awt.*;
import java.applet.Applet;
public class humnaface extends Applet
{
	public void paint (Graphics g)
	{
		g.drawOval(150,150,300,300);
		g.setColor(Color.pink);
		g.fillOval(220,220,40,20);
		g.fillOval(340,220,40,20);
		g.drawLine(300,280,300,340);
		g.setColor(Color.black);
		g.fillArc(230,340,150,60,180,180);
	}
}