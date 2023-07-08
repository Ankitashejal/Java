package InsertionSorting;

public class Insertionsort {
    public static void insertionsort(int arr[]) {
        int i;
        int n = arr.length;

        for(i=0 ; i<n-1 ; i++){
            int curr =i;
            int prev = i-1;
            while(prev >=0 && arr[prev] >arr[curr] ){
             arr[prev+1]=arr[prev];
             prev--;
            }
            //insertion
            arr[prev+1]=arr[curr];
        }
        
    }
    public static void printArr(int arr[]) {
        for(int i= 0; i<arr.length ;i++){
                   System.out.print(arr[i]+"");
               }
               System.out.println();
        
    }
    public static void main(String[] args) {
        int arr[]={5,4,1,3,2};
        insertionsort(arr);
        printArr(arr);
    }
}
