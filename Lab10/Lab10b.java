import java.util.*;
/**
 * @deprecated
 * This is Big Number class!!
 * Author: Büþra Oðuzoðlu
 * 15.12.2015
 */

public class Lab10b{
     public static void main(String[] args){
          
          
          //variables
          
          Scanner scan = new Scanner(System.in);
          BigNum[] random;
          random = new BigNum[10];
          
          //code
          
          
          
          //Random BigNum
          
          for(int k = 0; k < 10; k++){
               
               for(int i= 0; i < BigNum.SIZE; i++){
                    int[] randomDigits = new int[BigNum.SIZE];
                    
                    for(int q = 0; q < BigNum.SIZE; q++){
                         randomDigits[q] = (int)(Math.random() * BigNum.BASE);
                    }
                    
                    String str = "";
                    
                    for(int j = 0; j < BigNum.SIZE; j++){
                         str = str + randomDigits[j];
                    }
                    random[k] = new BigNum(str);
                    
               }
               System.out.println(random[k].toString());
          }
          
          System.out.println("Enter the value n: ");
          int n = scan.nextInt();
          BigNum max = new BigNum();
          max = random[0];
          for( int a = 1; a < n; a++ ){
               if(max.isLessThan(random[a]))
                    max = random[a];
          }
          System.out.println("Maximum BigNum: " + max.toString());
          
          // Find index of Max
          
          int indexMax = 0;
          
          for(int a = 0; a < BigNum.SIZE; a++){
               if(max.equals(random[a]))
                    indexMax = a;
          }
          
          System.out.println("Index of max is: " + indexMax);
          
          
          int ee;
          int scan2;
          do{
               System.out.println("Enter the index of the element you want to swap: ");
               ee = scan.nextInt();
               if (ee >= 0){
                    BigNum replace = random[ee];
                    random[ee] = random[indexMax];
                    random[indexMax] = replace;
                    
                    for (int e = 0; e < 10; e++ ){
                         System.out.println(random[e].toString());
                         
                    }
                    
                    System.out.println();
               }
               else {
                    System.out.println("Invalid value");
               }
               
          }while (ee > 0 && ee < BigNum.SIZE);
     }
}


