import java.util.*;
import javax.swing.*;
import java.awt.*;
import cs101.sosgame.SOS;


public class SOSCanvas extends JPanel{
      
      //Properties
      public static final int EDGE_LENGTH = 600;
      Graphics page;
      Color myColor = new Color(140,0,180);
      SOS game;
      double gridSize;              //number of boxes
      double boxEdge; 
      
      public void paintComponent(Graphics g){
      
            super.paintComponent(g);
            Graphics2D g2 = (Graphics2D)g;
            g2.setStroke( new BasicStroke(5.0f) );
            
            g.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
            g.setColor(myColor);
            
            double xPos = 0;
            double yPos = 0;
            
            for(int i = 0; i < (int)gridSize; i++ ){
                  xPos  = 0;
                  
                  for(int j = 0; j < (int)gridSize; j++ ){
                        
                        g2.drawRect( (int)xPos, (int)yPos, (int)this.boxEdge, (int)this.boxEdge);
                        
                        xPos += this.boxEdge;
                  }
                  yPos += this.boxEdge;
            }
            
            xPos = boxEdge/2;
            yPos = boxEdge/2;
            
            for(int k = 0; k < (int)gridSize; k++){
                  xPos = boxEdge/2;
                  for(int l = 0; l < (int)gridSize; l++){
                        g.drawString(game.getCellContents(l,k) + "", (int)xPos, (int)yPos);
                        xPos = xPos + boxEdge;
                  }
                  yPos += boxEdge;
            }
      } 
      
      public SOSCanvas(SOS game){
      
            this.setPreferredSize(new Dimension(EDGE_LENGTH+1, EDGE_LENGTH+1));
            
            this.game = game;
            this.gridSize = game.getDimension();
            
            this.boxEdge = EDGE_LENGTH / gridSize;
            this.setBackground(Color.WHITE);
            
            repaint();
      }
      
      public double getBoxEdge(){
      
            return boxEdge;
      
      }
     
}