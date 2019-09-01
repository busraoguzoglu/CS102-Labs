import java.util.Scanner;

public class deneme
{
  
  public static char printLine ( char tire )
  {
    tire = '-';
    System.out.println (tire);
    return(tire);
  }
  
  public static void main ( String[] args )
  {
    
    Scanner scan = new Scanner ( System.in );
    
    
    //variables
    
    int n;
    
    
    //code
    
    System.out.println ( "Enter n");
    
    n = scan.nextInt();
    
    System.out.println ( "\t" );
    
    for ( int i = 1 ; i <= n ; i++ )
    {
      
      System.out.print ( "\t" );
      System.out.print ( i );
      
    }
    
           System.out.println ( "\n");    
           System.out.println ( "--------------------------------------------------------------" );
           System.out.println ( "\n"); 
    
    
    for ( int x = 1 ; x <= n ; x++ )
    {
      System.out.print ( x + " : " );
      System.out.print ( "\t" );
      
      for ( int y = 1 ; y <= n ; y++ )
      {
        System.out.print ( x*y );
        System.out.print ( "\t" );
      
      } 
          System.out.print ( "\n" );
    }
    
           System.out.println ( "\n");    
           System.out.println ( "--------------------------------------------------------------" );

    
  }
}
    
    