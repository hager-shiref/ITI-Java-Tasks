import java.applet.Applet;
import java.awt.*;
public class FontList2 extends Applet{
		String [] fonts;
		GraphicsEnvironment g=GraphicsEnvironment.getLocalGraphicsEnvironment();
		int y=50;
		public void init()
		{
			fonts=g.getAvailableFontFamilyNames();
		}
		public void paint(Graphics g ){
		for(String i : fonts){
			Font small = new Font(i,Font.BOLD,14);
			g.setFont(small);
			g.drawString(i,10,y);
			y+=20;
			
		}
	}
	
}