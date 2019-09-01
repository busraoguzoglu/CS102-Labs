import shapes.*;
import java.util.*;
import java.awt.*;
import javax.swing.*;

public class Lab04b{
      
      public static void main (String[] args){
         
            //Deneme a = new Deneme();
            BalloonsGamePanel game = new BalloonsGamePanel();
      JFrame frame = new JFrame ("Balloons Game!!");
      
      frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
      frame.getContentPane().add (game);

      frame.pack();
      frame.setVisible(true);
            
      }

}