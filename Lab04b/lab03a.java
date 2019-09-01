import java.util.Scanner;

public class lab03a{

      public static void main(String[] args){
            Scanner scan = new Scanner(System.in);
            
            int n= scan.nextInt();
            System.out.println(n);
            
            int sum = 0;
            
            for(int x= 0; x <=50; x++){
                  if(n<= x){
                        sum+= x;
                  }
            }
            
            System.out.println(sum);
      }
}