import java.awt.event.*; 
import java.awt.*; 
import java.applet.*; 
 
   public class ThreeLines extends Applet{ 
 
 
   int x, y, x1, y1, l=0;  
   int [][] arr = new int[3][4]; 
 
   public void start(){ 
 
   MouseAdapter m = new MouseAdapter() { 
 
   public void mousePressed (MouseEvent e) { 
    x= e.getX(); 
    y = e.getY(); 
   } 
   public void mouseDragged(MouseEvent e) {  
 
   x1= e.getX(); 
 
   y1= e.getY(); 
 
   if (l<3) { 
 
   repaint (); 
   } 
   } 
   public void mouseReleased(MouseEvent e){ 
      l++; 
 
   } 
   }; 
 
   addMouseListener (m); 
 
   addMouseMotionListener(m); 
 
   } 
   public void paint (Graphics g) { 
 
   arr[l][0] = x; 
   arr[l][1] = y; 
   arr[l][2] = x1; 
   arr[l][3]=  x1; 
 
   for (int j =0; j<=l ; j++){  
 
   g.drawLine(arr[j][0], arr[j][1], arr[j][2], arr[j][3]); 
   } 
   } 
   }