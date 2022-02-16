import java.awt.*;
import java.applet.Applet;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ball extends Applet implements Runnable{
  int x=150,y=50,z=20,a=11,b=7;
  Thread t;
  boolean flag=false;
  
  public void init(){
    t=new Thread(this);
    Button start = new Button("start");
    Button stop = new Button("stop");
    
    
    start.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){
        if(flag){t.resume();}
        else{t.start();}
      }
    });
    add(start);
    
    stop.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){
        flag=true;
        t.suspend();
      }
    });
    add(stop);
    }
    public void paint(Graphics g){
      g.setColor(Color.BLACK);
      g.fillOval(x,y,z,z);
    }
    public void run(){
      while (true){
        x +=a;
        y +=b;
        if((x<=0) || (x+z>=bounds().width))
        {a=-a;}
      if((y<=0) || (y+z>=bounds().height))
        {b=-b;}
      
      try{
        repaint();
        Thread.sleep(100);
      }
      catch(Exception ie)
      {System.out.println(ie);}
      }
    }
  }