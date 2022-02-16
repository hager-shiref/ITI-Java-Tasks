import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class Counter extends Applet{
	private int counter;
	public void init(){
		Button btnIncrement= new Button("Increment");
		add(btnIncrement);
		Button btnDecrement=new Button("Decrement");
		add(btnDecrement);
		btnIncrement.addActionListener(new ActionListener (){
			public void actionPerformed(ActionEvent e){
				counter++;
				repaint();
			}
		});
		btnDecrement.addActionListener(new ActionListener (){
			public void actionPerformed(ActionEvent e ){
				if(counter>0)counter--;
				else counter=0;
				repaint();
			}
		});
	}
	public void paint(Graphics g){
		g.drawString("Counter : "+ counter, getWidth()/2,getHeight()/2);
	}
}