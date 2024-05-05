public class basic {

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
          
           //1>3>2>4>5
           a.next =b;   //1>3 2 4 5
           b.next = c;  //1>3>2 4 5
           c.next = d;  //1>3>2>4 5
           d.next = e;  //1>3>2>4>5
    
    //    Node temp = a;
    //   for(int i=1;i<=5;i++){                       will work only if we no thw size of node so we'll use while loop
    //     System.out.println(temp.data+"");
    //     temp = temp.next;
    //   }

    // //code for printing/displaying linked list
    // while(temp != null){
    //     System.out.println(temp.data+"");
    //     temp = temp.next;
    // }
        display(a);
        recursively(a);
        }
    }
    

