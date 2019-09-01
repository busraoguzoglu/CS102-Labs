import java.util.*;
import javax.swing.*;
import java.awt.*;

public class ButtonMatrix{

       public static void main (String[] args)
   {
      ButtonMatrixPanel game = new ButtonMatrixPanel();
      JFrame frame = new JFrame ("Button Matrix Game");
      frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);

      frame.getContentPane().add(new GamePanel());
      frame.getContentPane().add(game);

      frame.pack();

      frame.setVisible(true);
       }

}