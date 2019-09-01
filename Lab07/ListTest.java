public class ListTest{

      public static void main(String[] args){
      
            SimpleLinkedList list = new SimpleLinkedList();
            
            for(int i = 0; i< 4 ; i++){
                  list.addToHead("Number" + i);
            }
            System.out.println(list.toString());
            System.out.println();
            
            System.out.println(list.get(0));
            System.out.println(list.get(1));
            System.out.println(list.get(11213));
            System.out.println(list.get(-19));
            System.out.println(list.get(-1));
            System.out.println();
            
            System.out.println("Head: ");
            System.out.println(list.removeFromHead());
            System.out.println("Aaaaand it's gone");
            System.out.println(list.get(0));
            System.out.println();
            
            System.out.println(list.isEmpty());
            
            
      }
}