public class fact {
    public static int factorial(int n){
        //f is factorial
        int f = 1;
        for(int i=1 ;i<=n ;i++){
            f = f * i;
        }
        return f;//factorial of n
    }
    public static void main(String args[]) {
        int n=6;
        System.out.println(factorial(n));
    }
}
