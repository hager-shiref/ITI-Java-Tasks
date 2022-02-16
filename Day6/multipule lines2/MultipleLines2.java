import java.awt.event.*; 
import java.awt.*; 
import java.applet.*; 
import java.util.Vector;
public class MultipleLines2 extends Applet{
	int x1,y1,x2,y2;
	
	Vector <Integer> v1;  
	
   public void start(){ 
	v1=new Vector <Integer>();
   MouseAdapter m = new MouseAdapter() { 
 
   public void mousePressed (MouseEvent e) { 
    x1= e.getX(); 
    y1 = e.getY(); 
	repaint (); 

	
   } 
   public void mouseDragged(MouseEvent e) {  
 
   x2= e.getX(); 
   y2= e.getY(); 
    repaint (); 

   }  
   }; 
 
   addMouseListener (m); 
 
   addMouseMotionListener(m); 
 
   }
public void paint(Graphics g)
{
	v1.add(x1);
	v1.add(y1);
	v1.add(x2);
	v1.add(y2);
	
	
	for(int i : v1)
	{
		if(v1.size()-4 >i)
		{	g.drawLine(v1.get(i),v1.get(i+1),v1.get(i+2),v1.get(i+3));
		
	}
		
		
}
	}
	
}
