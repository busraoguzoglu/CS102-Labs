public abstract class Shape implements Locatable{

      //methods
      
      int x;
      int y;
      
      public abstract double getArea();
      
      public abstract String toString();
      
      public abstract int getX();
      
      public abstract int getY();
      
      public void setLocation( int x, int y ){
            this.x = x;
            this.y = y;
      }
}