import java.awt.*;
import java.applet.*;
public class Move extends Applet implements Runnable{
	private int x,y,flag;
	private String text;
	Thread th;
	public void init(){
		th=new Thread (this);
		text="Hello Java";
		x=50;
		y=50;
		flag=1;
		th.start();
	}
	public void update(){
		x=x+10*flag;
		if(x>getWidth()) {
			flag=-1;
			x=50;
			y+=10;
		}
		 if (x < getWidth())  flag = 1;
	}
	public void run()
    {
  
        while (true) {
            
  
            update();
            try {
				repaint();
                Thread.sleep(1000);
            }
            catch (InterruptedException ie) {
                System.out.printStackTrace(ie);
            }
        }
    }
	public void paint(Graphics g)
    {
        g.drawString(text, x, y);
    }
}