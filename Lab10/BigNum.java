
/**
 * @deprecated
 * This is Big Number class!!
 * Author: Büþra Oðuzoðlu
 * 15.12.2015
 */
public class BigNum {
     
     public static final int BASE = 10;
     public static final int SIZE = 8;
     
     // Properties
     
     int[] digits;
     
     // Constructors
     
     public BigNum() {
          digits = new int[SIZE];
          for (int c = 0; c < SIZE; c++){
              digits[c]=0;
          }
     }
     
     public BigNum(String a) {
          digits = new int[SIZE];
          for( int i = 0 ; i < a.length(); i++ ) {
               digits [i] = Character.getNumericValue(a.charAt(a.length() - (i + 1)));
          }          
     }
     
     // Copy Constructor
     
     public BigNum(BigNum a){
          digits = new int[SIZE];
          for( int i = 0; i < SIZE; i++ ){
               digits[i] = (a.getDigits())[i];
          }
     }
     
     
     // Methods
     
     public int[] getDigits(){
          return digits;
     }
     
     public String toString() {
          String str = "";
          for( int i = SIZE - 1; i >= 0; i-- ){
               str = str + digits[i];
          }
          return str;
     }
     
     public boolean equals(BigNum other) {
          int i = 0;
          while(i < SIZE && digits[i] == (other.getDigits())[i]){
               i++;
          }
          return i == SIZE;
     }
     
     public boolean isZero() {
          for ( int i : digits ){
               if ( this.digits[i] != 0) {
                    return false;
               }
               return true;
          }
          return false;
     }
     
     public void shift(boolean left) {
          
          if (left){
               for (int i = SIZE - 1 ; i > 0; i-- ){
                    digits[i] = digits[i-1];
               }
               digits[0] = 0;
          }
          else {
               for (int i = 0; i < SIZE - 1; i++){
                    digits[i] = digits[i + 1];
               }
          }     
     }
     
     public int add(BigNum other) {
          
          int remainder = 0;
          for ( int i = 0; i < SIZE; i++ ){
               
               if ( this.digits[i] + other.digits[i] >= BASE ){
                    
                    this.digits[i] = ( this.digits[i] + other.digits[i] + remainder) % BASE;
                    remainder = 1;
               }
               else{
                    
                    this.digits[i] = this.digits[i] + other.digits[i] + remainder;
                    remainder = 0;
               }
          }
          return remainder; 
     }
     
     public boolean isLessThan(BigNum other){
          for ( int i = SIZE-1; i >=0 ; i-- ){
               if(this.digits[i] < other.digits[i] ){
                    return true;
               }
               else if (this.digits[i] > other.digits[i]){
                    return false;
               }
          }
          return false;
          
          
     }
}