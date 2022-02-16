import java.applet.Applet;
import java.awt.*;

public class Shape extends Applet{
	public void init(){
		setSize(400, 400);
	}
	
	public void paint(Graphics g){
			g.drawRect(90,250,120,30);                

			g.drawLine(120,250,120,170);
			g.drawLine(170,250,170,170) ;                        

			//g.setColor(Color.YELLOW);
			//g.fillOval(85,161,135,40);
			g.drawArc(85,87,130,50,62,58);       

			g.drawLine(85,177,119,89);
			g.drawLine(215,177,181,89);              
			g.drawOval(77,180,140,10);
			g.setColor(Color.YELLOW);
			g.fillArc(78,120,40,40,63,-174);
			g.setColor(Color.YELLOW);                        
			g.fillOval(120,96,40,40);
			
			g.setColor(Color.YELLOW);
			g.fillArc(173,100,40,40,110,180);
		
		
	}
}