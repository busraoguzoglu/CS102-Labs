import shapes.*;
import java.util.Random;
import java.util.ArrayList;
import java.util.Iterator;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class BalloonsGamePanel extends JPanel{
      
      
      //Properties
      
      ShapeContainer balloons;
      Timer timer;
      Graphics page;
      JLabel score;
      int points;
      int elapsedTime;
      MouseListener myMouseListener;
      BalloonMouseListener ml;
      
      public static final int MAX_TIME = 150;
      
      //---------------------------
      //----PAINT_COMPONENT------
      //---------------------------
      
      public void paintComponent (Graphics page){
            
            super.paintComponent(page);
            Iterator it = balloons.iterator();
            setBackground(Color.black);
            
            while(it.hasNext()){
                  ((Drawable)(it.next())).draw(page);
            }
      }
      
      public void reset(){
             elapsedTime = 0;
             points = 0;
             timer.start();
             addMouseListener(ml);
      }
      
      public BalloonsGamePanel(){
            
            
            balloons = new ShapeContainer();
            Iterator bItr = balloons.iterator();
            
            for(int d= 0;d < 25; d++){
                  
                  Random rand = new Random();
                  int x = rand.nextInt(800);
                  int y = rand.nextInt(600);
                  balloons.add(new Balloon(x,y));
            }
            
            
            
            TimeListener listener = new TimeListener();
            timer = new Timer (100, listener);
            timer.start();

            ml = new BalloonMouseListener();
            addMouseListener(ml);
            
            score = new JLabel( "Points " + points + "\t Time Elapsed: " + elapsedTime );
            
            score.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
            score.setForeground(Color.WHITE);
            
            add(score);
            score.setVerticalAlignment(JLabel.TOP);
            score.setHorizontalAlignment(JLabel.CENTER);
            
            setPreferredSize(new Dimension(800,600));
            setBackground(Color.pink);
            
            
      }
      
      //methods
      
      
      
      private class BalloonMouseListener implements MouseListener
      {
            
            public void mousePressed (MouseEvent event)
            {
                  int x = event.getX();
                  int y = event.getY();
                  
                  int p = balloons.selectAllAt(x,y);
                  points = points + p;
                  balloons.removeSelectedShapes();
                  
                  repaint();
                  
                  score.setText("Points " + points + "\t Time Elapsed: " + elapsedTime);
                  
            }
            
            public void mouseClicked (MouseEvent event) {}
            public void mouseReleased (MouseEvent event) {}
            public void mouseEntered (MouseEvent event) {}
            public void mouseExited (MouseEvent event) {}
      }
      
      private class TimeListener implements ActionListener{
            
            public void actionPerformed(ActionEvent evt){
                  
                  Iterator itr = balloons.iterator();
                  
                  while( itr.hasNext()){
                        ((Balloon)itr.next()).grow();
                  }
                  balloons.removeSelectedShapes();
                  if(balloons.size() <= 20){
                        for(int d =0; d < 25-balloons.size(); d++){
                              balloons.add(new Balloon());
                        }
                  }
                  elapsedTime++;
                  score.setText("Points " + points + "\t Time Elapsed: " + elapsedTime);
                  repaint();
                  
                  if(elapsedTime >= MAX_TIME){
                        timer.stop();
                        removeMouseListener(ml);
                        
                        int selection = JOptionPane.showConfirmDialog(BalloonsGamePanel.this, "Play Again =) ?" , "Game Over =( ", 0);
                        if(selection == JOptionPane.YES_OPTION){
                             
                              reset();
                              score.setText("Points " + points + "\t Time Elapsed: " + elapsedTime);
                              
                        }
                        else if(selection == JOptionPane.NO_OPTION){
                              System.exit(0);
                        }
                        
                  }
            }
      }
      
}