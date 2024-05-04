public class main {
    
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

    // Traversing the linked list and printing its elements
    Node current = a; // Start from the head node
    while (current != null) {
        System.out.print(current.data + " "); // Print current node's data
        current = current.next; // Move to the next node
    }
    // //    System.out.println(a.next); //main$Node@36baf30c
    //    System.out.println(a.next.data);
    // //    System.out.println(a);     //main$Node@36baf30c
    // // System.out.println(x.data);

    
    }
}
