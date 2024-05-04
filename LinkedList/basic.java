public class basic {
    
        public static class Node{
            int data; //value
            Node next; //address of next node
    
             Node(int data) {
                this.data = data;
            //     this.next = null;
            }
        }
        
        public static void main(String[] args) {
           Node a = new Node(1);
           Node b = new Node(3);
           Node c = new Node(2);
           Node d = new Node(4);
           Node e= new Node(5);
          
           //1>3>2>4>5
           a.next =b;   //1>3 2 4 5
           b.next = c;  //1>3>2 4 5
           c.next = d;  //1>3>2>4 5
           d.next = e;  //1>3>2>4>5
    
       Node temp = a;
      for(int i=1;i<=5;i++){
        System.out.println(temp.data+"");
        temp = temp.next;
      }
        
        
        }
    }
    

