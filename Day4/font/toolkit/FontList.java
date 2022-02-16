import java.applet.Applet;
import java.awt.*;
public class FontList extends Applet
{
	//using toolkit
	Toolkit t=Toolkit.getDefaultToolkit();
	String [] names;
	int y=100;
	public void init(){
		names=t.getFontList();
	}
	public void paint(Graphics g ){
		for(String i : names){
			Font small = new Font(i, Font.BOLD,14);
			g.setFont(small);
			g.drawString(i,50,y);
			y+=20;
			
		}
	}
}