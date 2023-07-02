package Advanced_patterns;

public class Floyds_triangle {
    public static void star(int n){
        int counter=1;
        //outer loop
    for(int i =1;i<=n;i++){
        //inner loop
        for(int j=1;j<=i;j++){
          System.out.print(counter+" ");
          counter++;
        }
        System.out.println();
    }
    }
    public static void main(String args[]){
        star(5);
}
}
