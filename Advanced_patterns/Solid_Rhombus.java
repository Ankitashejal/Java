package Advanced_patterns;

public class Solid_Rhombus {
    public static void star(int n){
        //outer loop
        for(int i=1;i<=n;i++){
            //spaces: n-i
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //stars: n
             for(int j=1;j<=n;j++){
                System.out.print("*");
        }
        System.out.println();
    }
}
    public static void main(String args[]){
        star(5);
    }

    

}
