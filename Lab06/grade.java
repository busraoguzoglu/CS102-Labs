import java.util.Scanner;

public class grade
{
  
  public static char toLetter ( int grade, char gradeLet )
  {
    
    
    
    if ( grade >= 85 )
    {
      gradeLet = 'A';
      
    }
    else if ( grade < 85 && grade >= 70 )
    {
      gradeLet = 'B';
      
    }
    else if ( grade < 70 && grade >= 50)
    {
      gradeLet = 'C';
      
    }
    else if ( grade < 50 )
    {
      gradeLet = 'D';
      
    }
    
    
    
    return gradeLet;
    
  }
  
  public static void main ( String[] args )
  {
    
    Scanner scan = new Scanner ( System.in );
    
    
    
    //variables
    
    int grade;
    char gradeLet = ' ';
    
    //constants
    
    //program code
    
    
    System.out.println ( " Please enter the grades " );
    
    do
    {
      
      grade = scan.nextInt();
      gradeLet = toLetter(grade, gradeLet );
      
      System.out.println( gradeLet );
      
      
    }while ( grade != -1 );
    
    System.out.println ( "Bye Bye" );
  }
}
