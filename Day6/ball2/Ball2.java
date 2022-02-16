import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
 
public class Ball2 extends Applet implements  MouseListener, MouseMotionListener
{
   
    int mx;
    int my;
 
 
    public void init()
    {
        addMouseListener( this );
        addMouseMotionListener( this );
    }
 
    public void paint (Graphics g)
    {
            g.setColor(Color.blue);
            g.fillOval(mx, my, 50, 50);
    }
 
    public void mousePressed(MouseEvent e)
    {
        mx = e.getX();
        my = e.getY();
        repaint();
    }
 
    public void mouseReleased(MouseEvent e){}
    public void mouseEntered(MouseEvent e)  {}
    public void mouseExited(MouseEvent e) {}
    public void mouseMoved(MouseEvent e){}
    public void mouseClicked(MouseEvent e)  { }
    public void mouseDragged(MouseEvent e) {}
 
}