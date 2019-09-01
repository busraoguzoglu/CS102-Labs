import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ButtonMatrixPanel extends JPanel{
      
      
      private int count;
      private ArrayList<JButton> buttons;
      private LabelPanel label;
      private JButton push;
      Random rand = new Random();
      public Boolean isGameOver;
      int  n;
      JPanel buttonPanel;
      
      //-----------------------------------------------------------------
      //  Constructor: Sets up the GUI.
      //-----------------------------------------------------------------
      
      public ButtonMatrixPanel ()
      {    
            
            isGameOver = false;
            n = rand.nextInt(25);   
            
            label = new LabelPanel();
            this.add(label, BorderLayout.NORTH);
            
            buttons = new ArrayList<JButton>();
            
            for( int d = 0; d < 25; d++ ){
                  push = new JButton ("Push Me!" + ( d + 1 ) );
                  buttons.add(push);
            }
            
            for( int b = 0; b < 25; b++ ){
                  
                        buttons.get(b).addActionListener(new ButtonListener(b));           
            }
            
            this.setLayout(new FlowLayout());
            
            JPanel buttonPanel = new JPanel(new GridLayout(5,5));
            
            for( int x = 0; x < 25; x++ ){
                  buttonPanel.add(buttons.get(x));
            }
            
            this.add(buttonPanel);
            
            setPreferredSize (new Dimension(600, 300));
            setBackground (Color.yellow);
            
      }
      
      
      //*****************************************************************
      //  Represents a listener for button push (action) events.
      //*****************************************************************
      
      
      
      
      private class ButtonListener implements ActionListener
      {
            int index;
            
            public ButtonListener(int index){
                  this.index = index;
            }
            
            public void actionPerformed (ActionEvent event)
            {
                  count++;
                  if(index == n){
                  label.setText("Hurray!! Prize Found in  " + count + "  tries.");
                  count = 0;
                  n = rand.nextInt(25);
                  }
                  else
                  label.setText("Pushes: " + count);
            }
      }
      
      
      public boolean isGameOver(){
            return this.isGameOver;
      }
      
      public void resetGame(){
            
      }
}