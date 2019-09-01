
/** 
 * Library Class!!
 * Author:Büþra Oðuzoðlu
 * 01.12.2015 
 */

public class LibraryBook{
     
     //properties
     
     String  title;
     String  author;
     String  dueDate;
     int     timesLoaned;
     boolean onLoan;
     
     //constructors
     
     public LibraryBook ( String theTitle, String theAuthor /*String theDueDate, theTimesLoaned*/ ){
          
          title =       theTitle;
          author =      theAuthor;
          dueDate =     "";
          timesLoaned = 0;
          onLoan =      false;
          
     }
     
     //Copy Constructor
     
     public LibraryBook ( LibraryBook originalBook ) {
          
          title =  originalBook.title;
          author = originalBook.author;
          
          
     }
     
     public LibraryBook(){}
     
     //methods
     
     public void loan(String promise){
          if ( onLoan ){
               System.out.println ( "Already loaned ");
          }
          else{
               dueDate = promise;
               timesLoaned++;
               onLoan = true;
          }
     }
     
     
     public void returnBook(){
          dueDate = "";
          onLoan = false;
     }
     
     public String toString(){
          return timesLoaned + "";  
     }
     
     public void display(){
          System.out.println("Title: " + title + "\n" + "Author: " + author + "\n" + "Due Date: " + dueDate + "\n" + "Times Loaned: " + timesLoaned + "\n" + "On Loan: " + onLoan );
     }
     
     public boolean equals(LibraryBook theBook){
          if( theBook == null ){
               return false;
          }
          return (this.title == theBook.title && this.author == theBook.author);
     }
     
     public boolean hasSameTitle (LibraryBook theBook){
          return (this.title == theBook.title);
     }
     
     public boolean hasSameAuthor (LibraryBook theBook){
          return (this.author == theBook.author);
     }
     
     public String getTitle (LibraryBook theBook){
       return (title.theBook);
     }
}