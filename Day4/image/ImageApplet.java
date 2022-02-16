import java.applet.Applet;
import java.awt.*;
public class ImageApplet extends Applet
{
    Image image;
	 int imageX, imageY;
	 MediaTracker mt;
    public void init()
    {
        image=getImage(getDocumentBase(),"wall.jpg");
		 mt = new MediaTracker(this);
		  mt.addImage(image, 0);

    }
	public void start(){
		 while(!mt.checkAll(true)){}
        imageX = image.getWidth(this);
        imageY = image.getHeight(this);
        showStatus("Resizing Applet image size: " + imageX + "x" + imageY);
        resize(imageX, imageY);
    }
	
    public void paint(Graphics g)   
    {
       g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
	   
    }
}

