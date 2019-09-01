import shapes.*;
import java.util.Random;
import java.util.ArrayList;
import java.util.Iterator;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Deneme extends JPanel{
      
      
      //Properties
      
      ShapeContainer balloons;
      Timer timer;
      Graphics page;
      JLabel score;
      JLabel time;
      int poins;
      int elapsedTime;
      
      //---------------------------
      //----PAINT_COMPONENT------
      //---------------------------
      
      public void paintComponent (Graphics page){
            
            super.paintComponent(page);
            Iterator it = balloons.iterator();
            setBackground(Color.green);
            
            while(it.hasNext()){
                  ((Drawable)(it.next())).draw(page);
            }
      }
      
     
      
      public Deneme(){
            
            balloons = new ShapeContainer();
            Iterator bItr = balloons.iterator();
            
            for(int d= 0;d < 25; d++){
                  
                  Random rand = new Random();
                  int x = rand.nextInt(800);
                  int y = rand.nextInt(600);
                  balloons.add(new Balloon(x,y));
            
            points = 0;
            elapsedTime = 0;
            
            TimeListener listener = new TimeListener();
            timer = new Timer (250, listener);
            timer.start();

            
        addMouseListener(new BalloonMouseListener());
            
            score = new JLabel( "Points " + points + "");
            add(score);
            time = new JLabel("time" + elapsedTime + "");
            add(time);
            
            score.setVerticalAlignment(JLabel.TOP);
            score.setHorizontalAlignment(JLabel.LEFT);
            
             time.setVerticalAlignment(JLabel.TOP);
             time.setHorizontalAlignment(JLabel.RIGHT);
            
            setPreferredSize(new Dimension(800,600));
            setBackground(Color.pink);
            }    
            
      }
      
      //methods
      
      
      
      private class BalloonMouseListener implements MouseListener
      {
            
            public void mousePressed (MouseEvent event)
            {
                  int x = event.getX();
                  int y = event.getY();
                  
                  points = points + balloons.selectAllAt(x,y);
                  balloons.removeSelectedShapes();
//                  if(balloons.size() < 23){
//                        balloons.add(new Balloon());
//                  }
                  repaint();
                  
                  score.setText("Points " + points );
                  
    
            }
            
            public void mouseClicked   (MouseEvent event) {}
            public void mouseReleased (MouseEvent event) {}
            public void mouseEntered  (MouseEvent event) {}
            public void mouseExited   (MouseEvent event) {}
      }
      
      private class TimeListener implements ActionListener{
            
            public void actionPerformed(ActionEvent evt){
                  
                  Iterator itr = balloons.iterator();
                  
                  while( itr.hasNext()){
                        ((Balloon)itr.next()).grow();
                        repaint();
                        balloons.removeSelectedShapes();
                        
//                        if(((Balloon)itr.next()).radius == 0){
//                              ((Balloon)itr.next()).setSelected(true);
//                              balloons.removeSelectedShapes();
                                    
                        }

                        elapsedTime++;
                        
                        time.setText("Time Elapsed: " + elapsedTime + "");
                  }    
            } 
      }
      