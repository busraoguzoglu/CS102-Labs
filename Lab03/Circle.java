import java.util.*;
public class Circle extends Shape implements Selectable{


      //properties
      
      int radius;
      boolean selected;
      
      //constructor
      public Circle( int radius ){
            this.radius = radius;
      }
      
      //methods
      public double getArea(){
            return (Math.PI*radius*radius);
      }
    
      public String toString(){
            return "Circle, Radius: " + this.radius + " Is Selected: " + this.selected + "\t";
      }
      
      public void setLocation( int x, int y ){
            this.x = x;
            this.y = y;
      }
      
      public int getX(){
            return this.x;
      }
      
      public int getY(){
            return this.y;
      }   
      
      public boolean getSelected(){
            return selected;
      }
      
      public void setSelected( boolean sel ){
            selected = sel;
      }
      
      public Shape contains( int x, int y ){
           if( Math.pow((this.getX()-x),2) + Math.pow((this.getY()-y),2) <= Math.pow(this.radius,2) )
                 return this;
           return null;
      }
      
      
      //(i) = Error: Circle is not abstract and does not override abstract method getArea() in Shape
      //(ii)= it compiles.
      //(iii) = Error: Circle is abstract; cannot be instantiated

}