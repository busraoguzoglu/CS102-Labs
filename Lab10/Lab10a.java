import java.util.*;
/**
 * @deprecated
 * This is Big Number class!!
 * Author: Büþra Oðuzoðlu
 * 15.12.2015
 */

public class Lab10a{
     public static void main(String[] args){
          
          //variables
          
          BigNum b1;
          BigNum b2;
          BigNum b3;
          BigNum b4;
          BigNum b5;
          
          b1 = new BigNum();
          b2 = new BigNum("110");
          b3 = new BigNum(b2);
          b4 = new BigNum("11001011");
          b5 = new BigNum("11001111");
          
          //Code
          
          // Shifting
          
          System.out.println(b2.toString());
          b2.shift(true);
          System.out.println(b2.toString());
          b2.shift(false);
          System.out.println(b2.toString());        
          b2.shift(false);
          System.out.println(b2.toString());        
          
          // Adding
          
          System.out.println("b2 + b3 returns: " + b2.add(b3));
          System.out.println("b4 + b5 returns: " + b4.add(b5));
          System.out.println(b2);
          
          System.out.println(b4.isLessThan(b5));
     }
}