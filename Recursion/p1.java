public class p1 {
     public static void main(String[] args) {
        int n=10; //prints n
        printdec(n);

     }

     static void printdec(int n) {
        if(n==1)//if n1 ke equal nahi toh if se abhar niklo n ko consider karo and then print n-1 i.e 10-1=9
        {  
            System.out.println(n);
            return;
        }
        System.out.print(n+" ");  //n
        printdec(n-1);//n-1 print karega
     }
}
