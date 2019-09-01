/** 
 * Library Book Class!!
 * Author:Büþra Oðuzoðlu
 * 01.12.2015 
 */


public class Library{
     
     // Properties
     
//     LibraryBook b1 = null;
//     LibraryBook b2 = null;
//     LibraryBook b3 = null;
//     LibraryBook b4 = null;
     
  ArrayList<LibraryBook> books;
  books = new ArrayList<LibraryBook>();
     
     // Constructors
     
     public Library(){
     }
     
     // Methods
     
     boolean isEmpty(){
       return (books.size()==0);
       }
     }
     
     public String toString(){
       return books.toString();
     }
     
     public String displayAll() {
       return books;
     }
     
     public void add(String theTitle, String theAuthor){
          LibraryBook a = new LibraryBook(theTitle, theAuthor);
          books.add(a);
     }
     
//     public void remove(LibraryBook a){
//          books.remove(a);
//     }

     
      public void remove(LibraryBook a){
          int i = 0;
          while(!a.equals(book.get(i))){
               i++;
          }
          if(i < books.size()){
               book.remove(i);
          }
     }

      
      public LibraryBook findByTitle(String search){
          int i = 0;
          while (i < books.size() && !search.equals((books.get(i)).getTitle()) ){
               i++;
          }
          if(i < books.size()){
               (books.get(i)).displayDetails();
               return books.get(i);
          }
          else{
               return null;
          }
     }
      
      
     public void displayDetails(LibraryBook a){
          if(a != null){
               a.displayDetails(); 
          }
     }
     
}