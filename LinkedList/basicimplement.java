public class basicimplement {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    
    public static class linkedlist{
        Node head = null;
        Node tail = null;

        void insertAtEnd(int val){
            Node temp = new Node(val); //naya node banao
            tail.next = temp;  //tail ke next maiusko lagao
            tail = temp;  //fir usko hi tail banao ab ye sab tabhi kam karega when i already have ements in my list

        }
        void display(){
            Node temp = head;
            while (head!= null){
                System.out.println(temp.data+"");
                temp = temp.next;  //head ke next ko head banao agar usko display karega toh se next ko print karega ab ise naya print karega and so on.
            }
        }
    }
    
    public static void main(String[] args) {
        linkedlist ll  = new linkedlist();
        ll.insertAtEnd(1);
        ll.insertAtEnd(2);
        ll.display();
        
    }
}
