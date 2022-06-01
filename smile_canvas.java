import java.awt.*;
import javax.swing.*;

class Ab extends Canvas
{
    public void paint( Graphics g)
    {
         g.drawOval(40,40,200,200);
         g.setColor(Color.red);
        // g.drawOval(50,50,20,20);
         g.drawOval(85,90,40,30);
         g.fillOval(85,90,40,30);
         g.drawOval(155,90,40,30);
         g.fillOval(155,90,40,30);
         g.drawLine(140,120,140,140);
         g.drawArc(80,90,120,100,0,-180);
    }
    public static void main(String args[])
    {
            
       Ab a=new Ab();
  
       JFrame F=new JFrame();

       F.add(a);
       F.setSize(300,400);
       F.setVisible(true);
    }
    
}
