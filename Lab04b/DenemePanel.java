import shapes.*;
import java.util.Random;
import java.util.ArrayList;
import java.util.Iterator;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class DenemePanel extends JPanel{
    
          ShapeContainer balloons;
      Timer timer;
      Graphics page;
      JLabel score;
      int points;
      int elapsedTime;
      
      public void paintComponent (Graphics page){
            
            super.paintComponent(page);
            Iterator it = balloons.iterator();
            setBackground(Color.green);
            
            while(it.hasNext()){
                  ((Drawable)(it.next())).draw(page);
            }
      }
      
      public DenemePanel(){
            
             setPreferredSize(new Dimension(800,600));
            setBackground(Color.pink);
            
            Balloon b = new Balloon (200,200);
            b.draw(page);
            
           
      
      }
}