import java.util.Scanner;

public class deneme2
{
  
  public static void main ( String[] args )
  {
    
    Scanner scan = new Scanner ( System.in );
    
    
    //variables
    
    int n;
    int counter;
    
    //constants
    
    final char star = '*';
    final char space = 'x';
    
    
    //code
    
    System.out.println ( " Enter n: " );
    n = scan.nextInt();
    counter = n;
    
while ( counter > 0 )
{
  for ( int counter2 = 0; counter2 < counter ; counter2++)
{
  System.out.print(space);
}
  
  for ( int counter3 = (n-1) ; counter3 < counter ; counter3++)
  {
    System.out.print(star);
  }
  
 counter = counter++;
}
  }
}