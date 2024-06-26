package Queue;

public class basicsq2 {

    static class queueA{
        int f =-1;
        int r = -1;
        int size = 0;
        int[] arr = new int[5];
        public void add(int val){
            if(r==arr.length-1){
                System.out.println("queue is full");
                return ;
            }
            if(f==-1) f=r=0;
            else{
                arr[r+1]= val;
                r++;
            }
            size++;
        }
        public int remove(){
            if(size==0){
                System.out.println("queue is empty");
                return -1;
            }
            f++;
            size--;
            return arr[f-1];

        }
        public int peek(){
            if(size==0){
                System.out.println("queue is empty");
                return -1;
            }
            return arr[f];

        }
        public boolean isEmpty(){
            if( size==0) return true;
            else return false;
            
        }
        public void display(){
            if(size==0){
                System.out.println("queue is empty");
            }
            else{
                for(int i=f;i<=r;i++){
                    System.out.print(arr[i]+" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
       queueA q = new queueA();
       q.display();
    }
}
