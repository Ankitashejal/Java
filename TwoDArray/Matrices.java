
package TwoDArray;
import java.util.Scanner;

public class Matrices {
    public static boolean search (int arr[][], int key) {
        for(int i=0 ; i<arr.length ; i++){
            for(int j = 0; j<arr[0].length ; j++){
                if(arr[i][j]==key){
                    System.out.println("key found at cell()"+"i"+","+"j)");
                    return true;
                }
             }
            }
             return false;
            
    }
    public static void main(String[] args) {
        int rows=3;
        int cols=3;
        int arr [][] = new int[rows][cols];
         
         
        Scanner sc = new Scanner(System.in);
        for(int i=0 ; i<rows ; i++){
            for(int j = 0; j<cols ; j++){
               arr[i][j] = sc.nextInt();
            }
        }
        
        //output
         for(int i=0 ; i<rows ; i++){
            for(int j = 0; j<cols; j++){
                
                System.out.print(arr[i][j]+"");
            }
            System.out.println();
        }
        search(arr, 5);

    }
}
