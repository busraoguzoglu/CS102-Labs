import java.util.Scanner;


public class Lab06
{
  
  //main
  
  public static void main( String[] args)
  {
  
    Scanner scan = new Scanner(System.in);
    
  }
  

//kuvvet
  
  public static int power( int x,int y, int z )
  { 
      z = 1; 
    
    for ( int counter1 ; counter1 < y ; counter1++ )
      z = ( z * x );
  }
  
 
  
  //Faktöriyel
  
  public static int factorial ( )
  {   
    Scanner scan = new Scanner(System.in);
    int n;
    n = scan.nextInt();
    int s = 1;
    
    if ( n > 0 )
    {
      for ( int counter2 = 1 ; counter2 < n ; counter2++ )
        s = ( s * counter2 );
    }
    
    else
      System.out.println ( " number must be greater than zero! " );
    
  }
  
  // yazýyý ters çevirme:
  
  public static String reverse ( string s );
  
    string s;
    
  for ( int index = s.length(); int index >= 0 ; index-- )
      System.out.println ( s.charAt( index ));
  }
  
  //toDecimal
  public static int toDecimal( String base2 )
  {
    
    
    
    
  }

//write a method that converts a positive decimal int value into the corresponding binary String.
  public static int intToBin()
  {

  }
  
  
  
  

}


    