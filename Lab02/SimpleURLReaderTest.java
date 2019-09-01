
import cs1.SimpleURLReader;

/**This is the test class
 * @author: Büþra Oðuzoðlu
 * 23.02.2016
 * @version:1.0
 * 
 */

public class SimpleURLReaderTest{
  public static void main( String[] args ){
    SimpleURLReader reader = new SimpleURLReader("http://www.cs.bilkent.edu.tr/~david/housman.txt"); 
    MySimpleURLReader myReader = new MySimpleURLReader("http://www.cs.bilkent.edu.tr/~david/housman.txt");
    HTMLFilteredReader filReader = new HTMLFilteredReader("http://www.cs.bilkent.edu.tr/~david/housman.htm");
    SuperHTMLFilteredReader supReader = new SuperHTMLFilteredReader("http://www.cs.bilkent.edu.tr/~david/index.html");
    
    
    System.out.println( reader.getPageContents() );
    System.out.println( reader.getLineCount() );
    
    System.out.println( myReader.getURL() );
    System.out.println( myReader.getName() );
    System.out.println( myReader.getPageContents() );
    
    System.out.println( filReader.getPageContents() );
    System.out.println( filReader.getUnfilteredPageContents() );
    
    System.out.println( reader.getPageContents() );
    
    System.out.println( supReader.getLinks() );
  }
}