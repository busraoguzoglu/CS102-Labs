
/** 
 * Testing Library Book Class!!
 * Author:Büþra Oðuzoðlu
 * 01.12.2015 
 */


public class TestLibraryBook{
     
     public static void main(String[]args){
          
          //Books   
          
          LibraryBook bigJava;
          LibraryBook calculus;
          LibraryBook pirateBigJava;
          LibraryBook anotherBigJava;
          LibraryBook pirateCalculus;
          
          
          calculus = new LibraryBook("Calculus", "Stewart");
          bigJava =  new LibraryBook("Big Java", "Cay S. Hortsmann");
          pirateBigJava = new LibraryBook("Big Java","Cay S. Hortsmann");
          anotherBigJava = bigJava;
          pirateCalculus = new LibraryBook ( calculus );
          
         //Test

          bigJava.loan("25.11.2015");
          bigJava.display();
          System.out.println("\n");
          
          bigJava.loan("30.11.2015");
          bigJava.display();
          System.out.println("\n");
          
          bigJava.returnBook();
          bigJava.display();
          System.out.println("\n");
          
          bigJava.loan("22.12.2015");
          bigJava.display(); 
          System.out.println("\n");
          
          calculus.loan("24.12.2015");
          calculus.display();
          System.out.println();
          
          //Compare two LibraryBook instances using == and .equals.
          
          //Comparing two different books
          
          System.out.println( "Comparing two different books " );
          System.out.println( calculus == bigJava );        //false
          System.out.println( calculus.equals(bigJava) );   //false
          System.out.println();
          
          //Comparing two books with same properties
          
          System.out.println( "Comparing two books with same properties " );
          System.out.println( pirateBigJava == bigJava );        //false
          System.out.println( pirateBigJava.equals(bigJava) );   //first false, true when "equals" method added :)
          System.out.println();
          
          //Comparing two books referring same object
          
          System.out.println( "Comparing two books referring same object " );
          System.out.println( anotherBigJava == bigJava );         //true
          System.out.println( anotherBigJava.equals(bigJava) );    //true
          System.out.println();
          
          //Testing "hasSameTitle" method
          
          System.out.println( "Testing hasSameTitle method " );
          System.out.println( anotherBigJava.hasSameTitle(bigJava) );    //true
          System.out.println();
          System.out.println( pirateCalculus.hasSameTitle(calculus) );    //true
          System.out.println();
          
          //Testing "hasSameAuthor" method
          
          System.out.println( "Testing hasSameAuthor method" );
          System.out.println( anotherBigJava.hasSameAuthor(bigJava) );    //true
          System.out.println();
          
          //random test
          
          System.out.println( "random test" );
          System.out.println( calculus == pirateCalculus );        //false
          System.out.println( calculus.equals(pirateCalculus) );   //true
          System.out.println();
     }
}
