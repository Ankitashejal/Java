public class p1 {
     public static void main(String[] args) {
        int n=10;
        printdec(n);

     }

     static void printdec(int n) {
        if(n==1){
            System.out.println(n);
            return;
        }
        System.out.print(n+" ");
        printdec(n-1);
     }
}
