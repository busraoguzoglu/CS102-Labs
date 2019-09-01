import java.util.Scanner;
public class StackTest{

      public static void main(String[] args){
     
            SimpleStack stack = new SimpleStack();
            Scanner scan = new Scanner(System.in);
            
            System.out.println("Please Enter David-o-Fix: ");
            String davix = scan.nextLine();
            int result = 0;
            
            for(int i = 0; i<davix.length(); i++){
                  if(davix.charAt(i) >= '0' && davix.charAt(i) <= '9')
                        stack.push(davix.charAt(i) + "");
                  else if (davix.charAt(i) == '+'){
                        
                        int first = Integer.parseInt(stack.pop());
                        int second = Integer.parseInt(stack.pop());
                        
                        result = first + second;
                        
                        stack.push(result + "");
                  }
                  else if (davix.charAt(i) == '-'){
                                                
                        int first = Integer.parseInt(stack.pop());
                        int second = Integer.parseInt(stack.pop());
                        
                        result = second-first;
                        
                        stack.push(result + "");
                  }
            }
          System.out.println(stack.pop());  
      }
}