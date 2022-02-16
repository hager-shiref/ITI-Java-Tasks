import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class StringMovement extends Applet
{
  
   int x=50;
   int y=50;
   int flag =1;
   
    
      public void right()
    {
  
        x = x + 10 * flag;
        if (x <getWidth())
            flag = 1;
        if (x > getWidth()){
       flag = -1;
       x=10;

    }
    }
  
     public void down()
    {
  
        y = y + 10 * flag;
        if (y <getWidth())
            flag = 1;
        if (y > getWidth()){
       flag = -1;
       x=10;

    }
    }
  
  
     public void left()
    {
  
        x= x-10 * flag;
        if (x <getWidth())
            flag = 1;
        if (x> getWidth()){
       flag = -1;
       x=10;

    }
    }
  
  
     public void up()
    {
  
        y = y - 10 * flag;
        if (y <getWidth())
            flag = 1;
        if (y > getWidth()){
       flag = -1;
       x=10;

    }
    }
   
  public void init(){
    
    this.requestFocus();
    addKeyListener(new KeyListener(){
      public void keyPressed(KeyEvent k){
    
    if( k.getKeyCode()==KeyEvent.VK_UP){
		up();
      
    }if( k.getKeyCode()==KeyEvent.VK_DOWN){
		down();
      
    }if( k.getKeyCode()==KeyEvent.VK_RIGHT){
		right();
      
    }if( k.getKeyCode()==KeyEvent.VK_LEFT){
		left();
      
    }
    repaint();
  }
  public void keyReleased(KeyEvent k){
    
  }
  public void keyTyped(KeyEvent k){
    
  }
      
    });
    setSize(300,200);
  }
  public void paint(Graphics g){
    
    g.drawString("Hello Java",x,y);
  }
  
}