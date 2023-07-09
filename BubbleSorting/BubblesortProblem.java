package BubbleSorting;

public class BubblesortProblem {
    public static void bubbleSort(int arr[]){
    int i,j;
    int n = arr.length;
    for( turn=0; turn<=n-2; turn++){
        for( j=0; j<=n-2-turn; j++){
            if(arr[j]>arr[j+1]){
                //swap
                temp = arr[j];
                arr[j] = arr[j+1];
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
        int arr[] = {3,6,2,1,8,7,4,5,3,1};
        bubbleSort(arr);
        printArr(arr);
    }

    
}
