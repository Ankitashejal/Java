package InsertionSorting;

public class insertionproblem {
    void sort(int arr[])
    {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int curr = arr[i];
            int prev = i - 1;
            while (prev >= 0 && arr[j] > curr) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
 
    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
 
        System.out.println();
    }
 
   
    public static void main(String args[])
    {
        int arr[] = { 12, 11, 13, 5, 6 };
 
        insertionproblem ob = new insertionproblem();
        ob.sort(arr);
 
        printArray(arr);
    }
}

