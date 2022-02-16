import java.applet.*;
import java.awt.*;

public class Ball extends Applet implements Runnable 
{
	
	int x = 100, y = 40, r=30;   
	int flag1 = 11, flag2 = 7;          
	
	Thread t;
	boolean stopFlag;

	
	public void start() 
	{
		t = new Thread(this);
		stopFlag=false; 
		t.start();
	}

	
	public void paint(Graphics g) 
	{
		g.setColor(Color.BLACK);
		g.fillOval(x-r, y-r, r*2, r*2);
	}


	public void run() 
	{
		while(true)
		{
			if(stopFlag)
				break;
			if ((x - r + flag1 < 0) || (x + r + flag1 > bounds().width)) flag1 = -flag1;
			if ((y - r + flag2 < 0) || (y + r + flag2 > bounds().height)) flag2 = -flag2;
			x += flag1;  y += flag2;

			try
			{
				repaint();
				Thread.sleep(100);
			}
			catch(Exception ie)
			{
				ie.printStackTrace();
			}
			
		}
	}
}