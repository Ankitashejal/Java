public class p2 {

    static void printInc(int n){
         if(n==1){
            System.out.print(n+" ");
            return;
         }
         printInc(n-1); //recursion call fun is imp
         System.out.print(n+" ");
    }
    public static void main(String[] args) {
       int n=10;
        printInc(n);

    }

}
