public class Rectangle extends Shape implements Selectable{
      
      
      //properties
      
      int width;
      int height;
      boolean selected;
      
      //constructor
      
      public Rectangle( int width, int height ){
            this.width  = width;
            this.height = height;
      }
      
      //methods
      public double getArea(){
            return width*height;
      }
      
      public String toString(){
            return "Rectangle,  Width : " + this.width + "  Height:  " + this.height + " Is Selected: " + this.selected + "/t";
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
           if( x>=this.x - width/2 && x<=this.x + width/2 && y>=this.y - height/2 && y<=this.y + height/2 )
                 return this;
           return null;
      }
}