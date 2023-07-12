package SelectionSorting;

public class selectionproblem2 {
    void selection(int a[])  
    {  
        int i, j, small;  
        int n = a.length;  
        for (i = 0; i < n-1; i++)  
        {  
            small = i; 
              
            for (j = i+1; j < n; j++)  
            if (a[j] < a[small])  
                small = j;  
    // Swap  
        int temp = a[small];  
        a[small] = a[i];  
        a[i] = temp;  
        }  
      
    }  
    void printArr(int a[])  
    {  
        int n = a.length;  
        for (int i = 0; i < n; i++)  
        System.out.print(a[i] + " ");  
    }  
      
        public static void main(String[] args) {  
        int a[] = { 91, 49, 4, 19, 10, 21 };  
       selectionproblem2 i1 = new selectionproblem2();  
        System.out.println("\nBefore sorting array elements are - ");  
        i1.printArr(a);  
        i1.selection(a);  
        System.out.println("\nAfter sorting array elements are - ");  
        i1.printArr(a);  
        System.out.println();  
        }  
}
