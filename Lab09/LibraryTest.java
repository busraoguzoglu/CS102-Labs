/** 
 * Testing Library Class
 * Author:Büþra Oðuzoðlu
 * 01.12.2015 
 */


import java.util.Scanner;
public class LibraryTest{
     
     static final String DIVIDER = "-----------------------";
     static final String HEADER = "LIBRARY OPTIONS";
     static final String SHOW = "1. SHOW";
     static final String FIND = "2. FIND";
     static final String ADD = "3. ADD";
     static final String EXIT = "4. EXIT";
     static final String OPTIONS = "BOOK OPTIONS :)";
     static final String LOAN = "1.LOAN";
     static final String RETURN = "2.RETURN";
     static final String REMOVE = "3.REMOVE";
     public static void displayMenu(){
          
          System.out.println(DIVIDER);
          System.out.println(HEADER);
          System.out.println(SHOW);
          System.out.println(FIND);
          System.out.println(ADD);
          System.out.println(EXIT);
          System.out.println(DIVIDER);
     }
     
     public static void displayMenu2(){
          
          System.out.println(DIVIDER);
          System.out.println(OPTIONS);
          System.out.println(LOAN);
          System.out.println(RETURN);
          System.out.println(REMOVE);
          System.out.println(EXIT);
          System.out.println(DIVIDER);
          
     }
     public static void main(String[]args){
          
          // Variables
          
          Scanner scan = new Scanner(System.in);
          Scanner scan2 = new Scanner(System.in);
          Scanner scan3 = new Scanner(System.in);
          Library myLibrary = new Library();
          int input;
          int input2;
          int secondIn;
          String thirdIn;
          String title;
          String author;
          String allBooks;
          
          // Program Code
          
          do{
               displayMenu();
               System.out.print("Please enter command number: ");
               input = scan.nextInt();
               if(input == 1){
                    allBooks = myLibrary.displayAll();
                    System.out.println (allBooks);
                    
               }
               
               else if(input == 2){
                    System.out.println("Please enter title: ");
                    thirdIn = scan2.nextLine();
                    //myLibrary.findByTitle(thirdIn);
                    if ( myLibrary.findByTitle(thirdIn)!= null ){
                         do{                         
                              displayMenu2();
                              System.out.println("What do you want to do with this book?");
                              input2 = scan.nextInt();
                              if (input2 == 1){
                                   Scanner sc =  new Scanner(System.in);
                                   System.out.println("Promise date?");
                                   String date = sc.nextLine();
                                   myLibrary.findByTitle(thirdIn).loan(date);
                                   
                              }
                              else if (input2 == 2){
                                   myLibrary.findByTitle(thirdIn).returnBook();
                                   
                              }
                              else if (input2 == 3){
                                   myLibrary.removeBook(myLibrary.findByTitle(thirdIn));
                              }
                         } while ( input2 != 4 );
                    }
                    
               }
               
               else if(input == 3){
                    System.out.println("Please enter title: ");
                    title = scan2.nextLine();
                    System.out.println("Please enter author: ");
                    author = scan3.nextLine();
                    myLibrary.add(title, author);
               }
               
               else if(input != 4){
                    System.out.println("Invalid input.");
               }
          }while(input != 4);
          
     }
}