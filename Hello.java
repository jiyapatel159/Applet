import java.applet.*;
import java.awt.*;
public class Hello extends Applet{
    public void paint(Graphics g){
        g.drawOval(100,100,300,300);
        g.drawString("hello",230,250);
    }
}