public class SimpleStack{

      //Properties
      SimpleLinkedList list;
      
      //Constructors
      public SimpleStack(){
            list = new SimpleLinkedList();
      }
      
      //Methods
      public void push( String item ){
            list.addToHead(item);
      }
      public String pop(){
            return list.removeFromHead();
      }
      public boolean isEmpty(){
            return list.isEmpty();
      }
}