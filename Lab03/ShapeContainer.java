import java.util.ArrayList;

public class ShapeContainer{
      
//properties
      
      ArrayList<Shape> container;
      
//constructors
      
      public ShapeContainer(){
            
            container = new ArrayList<Shape>();
      }
      
//methods
      
      public void add( Shape s ){
            container.add(s);
      }
      
      public double getArea(){
            double area = 0;
            for( int d = 0; d < this.container.size(); d++ ){
                  area = area + (this.container.get(d)).getArea();
            }
            return area;
      }
      
      public String toString(){
            
            String returnString = "";
            for( int d = 0; d < this.container.size(); d++ ){
                  returnString = returnString + (this.container.get(d)).toString();
            }
            return returnString;
      }
      
      public void findFirstShape( int x, int y ){
            int d = 0;
            
            if( container.size() > 0 ){
                  while ( d < container.size() && (((Selectable)container.get(d)).contains(x,y))==null ){
                        d++;
                  }
                  
                  if( d < container.size() && container.get(d)!= null && ((Selectable)container.get(d)).contains(x,y) != null ){
                        System.out.println(container.get(d).toString());
                        ((Selectable)container.get(d)).setSelected(true);
                        System.out.println( "Making it selected: " );
                        System.out.println(container.get(d).toString());
                  }
                  else
                        System.out.println(" There are no shapes that contain this (x,y) ");
            }
            else
            System.out.println(" There are no shapes in container ");
      }
      
      public void removeSelectedShapes(){
            ArrayList<Shape> newContainer = new ArrayList<>();
            
            for( int d = 0; d < container.size(); d++ ){
                  if( container.get(d) instanceof Selectable && !((Selectable)container.get( d )).getSelected() )
                        newContainer.add(container.get(d));
            }
            this.container = newContainer;
      }
      
}