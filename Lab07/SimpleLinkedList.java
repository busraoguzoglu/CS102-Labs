public class SimpleLinkedList{
      
      
      //Properties
      
      private Node head;
      
      public SimpleLinkedList(){
            head = null;
      }
      
      public void addToHead(String item){
            if(head == null)
                  head = new Node(item);
            else{
                  Node temp = head;
                  head = new Node(item);
                  head.next = temp;
            }
      }
      
      public String removeFromHead(){
            if( head== null ){
                  return null;
            }
            Node temp = new Node(head.data);
            String data = temp.data;
            head = head.next;
            return data;
      }
           
      public boolean isEmpty(){
            return (head == null);
      }
           
      public String get( int index){
            
           if(head == null || index < 0)
                 return null;
            
            if(index == 0)
                  return head.data;
            
            Node temp = head;
            int count = 0;
            
            while(temp.next!= null && (count < index)){
                  temp = temp.next;
                  count++;
            }
            if(temp == null || count < index)
                  return null;
            else
                  return temp.data;
      
      }
      
      public String toString(){
      
            String rtn = "";
            
            Node temp = head;
            
            while(temp != null){
            
                  rtn = rtn + temp.data + "  ";
                  temp = temp.next;
                  
            }
            return rtn;
      }

      
      private class Node{
      
            String data;
            Node next;
            
            public Node(String data, Node next){
                  this.data = data;
                  this.next = next;
            }
            
      
      }
}