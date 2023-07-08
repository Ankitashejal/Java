package BubbleSorting;

public class Bubblesort {
    public static void bubbleSort(int arr[]){
        int turn,j,temp;
        int n = arr.length;
        
         for ( turn = 0; turn<=n-2; turn++){
           for(  j=0; j<=n-2-turn; j++){
            if (arr[j]> arr[j+1]){
                //swap
                temp = arr[j];
                arr[j]= arr[j+1];
                arr[j+1] = temp;
            }
           }
        }
    }

    public static void printArr(int arr[]) {
 for(int i= 0; i<arr.length ;i++){
            System.out.print(arr[i]+"");
        }
        System.out.println();
    }
     public static void main(String args[]){
        int arr[] = {5,4,1,3,2};
        bubbleSort(arr);
        printArr(arr);
    }

    
    

}
