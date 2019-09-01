
import cs1.SimpleURLReader;
import java.util.ArrayList;
import java.util.Scanner;

/**This is the LinkTest Class
 * @author: Büþra Oðuzoðlu
 * 23.02.2016
 * @version:1.0
 * 
 */


public class LinkTest{

  //methods
  public static void menu(){
  
    System.out.println("1. Enter the url of poem to add to collection");
    System.out.println("2. List all poems in the collection");
    System.out.println("3. Quit");
    
  }
  
  public void subMenu(){
  
  
  }
  
  
  public static void main( String[] args ){
  
    
  //Variables
  Scanner scan = new Scanner(System.in);
  int input = 0;
  ArrayList<MySimpleURLReader> collection = new ArrayList<>();
  
    do{
      
      menu();
      System.out.println("Select:");
      input = scan.nextInt();
    
      if( input == 1 ){
      
        String url;
        url=scan.nextLine();
        System.out.println("enter url");
        url = scan.nextLine();
        
        String end = url.substring(url.length()-3, url.length());
        if (end.equals("txt")){
        
          MySimpleURLReader reader = new MySimpleURLReader(url);
          collection.add(reader);
        }
        else if(end.equals("htm") || end.equals("tml")){
        
          SuperHTMLFilteredReader reader = new SuperHTMLFilteredReader(url);
          collection.add(reader);
        }
      
      }
      if( input == 2 ){
      
        int ind;
        
        do{
        
        for( int d = 0; d < collection.size(); d++ ){
          System.out.println( (d) + ". " + collection.get(d).getName() );
        }
        
        System.out.print("Enter index: ");
        ind = scan.nextInt();
       
        if( ind < collection.size() )
          System.out.println(collection.get(ind).getPageContents());
        
        }while( ind != collection.size() );
        
      }      
    
    }while(input != 3);
  
  System.out.println("Goodbye!");
  }
  
  
}