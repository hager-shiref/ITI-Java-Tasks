import java.applet.Applet;
import java.awt.Graphics;
import java.util.Date;

public class DateApplet extends Applet implements Runnable{
	Date date;
	Thread th;
	public void init(){
		th=new Thread (this);
		th.start();
		try{
			Thread.sleep(1000);
		}
		catch(InterruptedException  ie){
			ie.printStackTrace();
		}
	}
	public void paint(Graphics g){
		date= new Date();
		g.drawString(date.toString(),getWidth()/2,getHeight()/2);
	}
	public void run(){
		while(true){
			
			try{
				repaint();
				Thread.sleep(1000);
			}
			catch(InterruptedException  ie){
				ie.printStackTrace();
			}
			
		}
	}
}