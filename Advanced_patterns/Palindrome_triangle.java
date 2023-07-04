package Advanced_patterns;

public class Palindrome_triangle {
    public static void star(int n){
        for(int i=1;i<=n;i++){
        //inner loop to print the spaces
        for(int j=1;j<=2*(n-i);j++){
            System.out.print(" ");
        }
        //to print 1st part
        for(int j=i;j>=1;j--){
            System.out.print(j + " ");
        }
        //to print 2nd part
        for(int j=2;j<=i;j++){
            System.out.print(j + " ");
        }
        System.out.println();
        }
    }
    public static void main(String args[]){
    star(7);
    }
}
