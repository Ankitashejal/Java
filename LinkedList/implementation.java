public class implementation {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data =data;
        }
        
    }
    public static class linkedlist{
        Node head = null;
        Node tail = null;
        int size = 0;
        void insertAtEnd(int val){
            // Node temp = new Node(val); ye tab hoga jab list mai kuch hai
            // tail.next = temp;
            // tail = temp;

            //if list is empty or not ke liye weill add  another condn
            Node temp = new Node(val);
            if(head==null){
                head=temp;
                // tail=temp; ab as we can see ki whatevr situ it is tail hamesha temp banege so we dont need to write it twice
            }
            else{
                tail.next = temp;
                // tail = temp;
            }
            tail = temp; // instead will write idhar ekbaar dono ke liye
        }

        void insertAtHead(int val){
         Node temp = new Node(val);
         if(head==null){   //empty list
            head = tail = temp;  //insertAtEnd(val);
         }
        else{  //non empty lsit
         temp.next =head;
         head = temp;
        }

        }

        void insertAt(int idx,int val){
            Node t = new Node(val);
            Node temp = head;
            for(int i=1;i<=idx-1;i++){
                temp = temp.next;
            }
            t.next = temp.next;
            temp.next=t;

        }

        int getAt(int idx){
            Node temp =head;
            for(int i=1;i<=idx;i++){
                temp = temp.next;
            }
            return temp.data;
        }

        void delAt(int idx){
            Node temp = head;
            for(int i=1;i<=idx-1;i++){
                temp = temp.next;
            }
            temp.next = temp.next.next;
            size--;
        }

        void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }

        int size() {
            Node temp = head;
            int count = 0;
            while (temp != null) {
                count++;
                temp = temp.next;
            }
            return count;
        }
    }
    public static void main(String[] args) {
        linkedlist ll = new linkedlist();
        // ll.insertAtHead(10);
        ll.insertAtEnd(4);
        // ll.display();
        ll.insertAtEnd(5);
        // ll.display();
        ll.insertAtEnd(12);
        // ll.display();
        ll.insertAtHead(13);
        // ll.display();
        ll.insertAt(4,10);
        // ll.display();
          ll.insertAt(0,100);
        //   ll.display();
          ll.delAt(4);
          ll.display();
        // System.out.println(ll.tail.data);
        // System.out.println(ll.getAt(3));
    }
}
