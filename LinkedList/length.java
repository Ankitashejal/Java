public class length {

    static int len(Node head){
        int count =0;
    while(head!=null){
    count++;
    head = head.next;

}
    return count;
    }


        //function to print recursively
        public static void recursively(Node head){
        if(head == null) return;
        System.out.println(head.data+"");
        recursively(head.next);
    
        }
    
        //function to print all the nodes    
        public static void display(Node head){
              Node temp = head;
              while(temp != null){
                System.out.println(temp.data+"");
                temp = temp.next;
              }
        }
        
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
               Node f =new Node(6);
              
               //1>3>2>4>5
               a.next =b;   //1>3 2 4 5
               b.next = c;  //1>3>2 4 5
               c.next = d;  //1>3>2>4 5
               d.next = e;  //1>3>2>4>5
               e.next = f;  //1>3>2>4>5>6

               System.out.println(len(a));
        
      
            }
        }
        
    
    

