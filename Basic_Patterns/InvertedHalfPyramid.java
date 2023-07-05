package Basic_Patterns;

public class InvertedHalfPyramid {
    public static void inverted_rotated(int n){
        for(int i=1;i<=n;i++){
            //spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
               }
               //stars
                for(int k=1;k<=i;k++){
                  System.out.print("*" );  
                
            }
            System.out.println();
        }

    }
    public static void main(String args[]){
        inverted_rotated(4);
    }
    
}


