import java.util.Scanner;
import java.util.ArrayList;

public class ShapeTester{
      
      public static void menu(){
            
            System.out.println(" *****************************************"); 
            System.out.println(" 1.Create an empty set of shapes: "); 
            System.out.println(" 2.Add Shape: ");
            System.out.println(" 3.Compute & Show Total Area: ");
            System.out.println(" 4.Find the Shape that contains given x,y: ");
            System.out.println(" 5.Remove All Selected Shapes from set: ");
            System.out.println(" 6.Quit. ");
            System.out.println(" ***************************************** "); 
      }
      
      public static void shapeMenu(){
            
            System.out.println(" ***************************************** "); 
            System.out.println(" 1.Create & Add a Rectangle: "); 
            System.out.println(" 2.Create & Add a Circle: ");
            System.out.println(" 3.Back to main Menu. ");
            System.out.println(" ***************************************** "); 
      }
      
      public static void main(String[] args){
            
            //Variables
            
            int input       = 0;
            int shapeInput = 0;
            Scanner scan       = new Scanner( System.in );
            Scanner shapeScan = new Scanner( System.in );
            ShapeContainer set = new ShapeContainer();
            
            //Menu
            
            do{
                  menu();
                  
                  System.out.println( "Please Select: " );
                  input = scan.nextInt();
                  
                  if( input ==1 ){
                        set = new ShapeContainer();  
                  }
                  
                  else if( input == 2 ){
                        
                        do{
                              shapeMenu();
                              System.out.println( "Please Select: " );
                              shapeInput = scan.nextInt();
                              
                              if( shapeInput == 1 ){
                                    System.out.print( "Enter heigth:" );
                                    int heigth = shapeScan.nextInt();
                                    System.out.println( "Enter width: ( Enter same with height if you want a square )" );
                                    int width = shapeScan.nextInt();
                                    Rectangle shape1 = new Rectangle( width, heigth );
                                    System.out.println(" Enter position x: ");
                                    int x = shapeScan.nextInt();
                                    System.out.println(" Enter position y: ");
                                    int y = shapeScan.nextInt();
                                    shape1.setLocation( x,y );
                                    set.add(shape1);
                              }
                              
                              else if( shapeInput == 2 ){
                                    System.out.print( "Enter radius:" );
                                    int radius = shapeScan.nextInt();
                                    Circle shape2 = new Circle( radius );
                                    System.out.println(" Enter position x: ");
                                    int x = shapeScan.nextInt();
                                    System.out.println(" Enter position y: ");
                                    int y = shapeScan.nextInt();
                                    shape2.setLocation( x,y );
                                    set.add(shape2);
                              }
                              
                        }while( shapeInput!= 3 );
                        
                  }
                  
                  else if ( input ==3 ){
                        System.out.println("Total Area is: " + set.getArea());
                  }
                  
                  else if( input ==4 ){
                        System.out.println("Enter x:");
                        int x = shapeScan.nextInt();
                        System.out.println("Enter y:");
                        int y = shapeScan.nextInt();
                        
//                        int select = 0;
//                        while( set.container.get(select) == null && select < set.container.size() && set.container.get(select).getX() == x && set.container.get(select).getY() == y){
//                              select++;
//                        }
//                        System.out.println(set.container.get(select).toString());
//                        (set.container.get(select)).setSelected(true);
                        
                        set.findFirstShape( x,y );
                  }
                  
                  else if( input ==5 ){
//                        for( int d = 0; d < set.container.size(); d++ ){
//                              if( set.container.get(d).getSelected() )
//                                    set.container.remove(d);
//                        }
                  set.removeSelectedShapes();
                  }
                  
            }while( input!= 6 ); 
            
            System.out.println(" Goodbye!! :) ");
      }   
}