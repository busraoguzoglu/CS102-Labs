import shapes.*;
import java.util.Random;
import java.util.ArrayList;
import java.util.Iterator;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class Balloon extends Circle implements Drawable{
      
      //properties
      public static final int RADIUS = 25;
      public static final int MAX_RADIUS = 100;
      Graphics g;
      
     
      
      public Balloon(int x, int y){
            super(RADIUS, x, y);
      }
      
      public Balloon(){
           
            super(RADIUS, 0,0);
            
             Random n = new Random();
             Random m = new Random();
             int x= n.nextInt(800);
             int y= m.nextInt(600);
            
            this.setLocation(x,y);
           
      }
      
       public void draw( Graphics g ){
             Graphics2D g2 = (Graphics2D)g;
             Stroke previousStroke = g2.getStroke();
             g2.setStroke(new BasicStroke(3.0f));
            
             Random c = new Random();
             int color = c.nextInt(4);
             
             if(color ==1)
                   g2.setColor(Color.MAGENTA);
             else if(color ==2)
                   g2.setColor(Color.CYAN);  
             else if(color ==3)
                   g2.setColor(Color.YELLOW);
             
             g2.drawOval(getX() - this.radius, getY() - this.radius, this.radius,this.radius ); 
             g2.setStroke(previousStroke);  
      }
      
       public boolean grow() {
             
             this.radius++;
             
             if (this.radius >= MAX_RADIUS) {
                   this.radius = 0;
                   this.setSelected(true);
             }
           
             if(this.radius == 0)
                   return false;
             else
                   return true;
       }

     
}