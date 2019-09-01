import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LabelPanel extends JPanel{

      int count;
      public JLabel label;
      
      public LabelPanel(){
            count = 0;
            label = new JLabel ("Pushes: " + count);
            add (label);
            
            label.setVerticalAlignment  (JLabel.TOP);
            label.setHorizontalAlignment(JLabel.CENTER);
            setBackground (Color.yellow);
            
            setPreferredSize (new Dimension(600, 40));
      }
      
      public void setText(String string){
            label.setText(string);
      }
}