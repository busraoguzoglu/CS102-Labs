public class Square extends Rectangle{
      
      
      //properties
      
      int side;
      
      //constructor
      
      public Square( int side ){
            
            super( side,side );
      }
      
      //methods
      
      public String toString(){
            return "Square, Side: " + this.side + " Is Selected: " + this.selected + "/t";
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
      
}