 package Advanced_patterns;

 public class HollowSquare {
    // Function to demonstrate pattern
    public static void printPattern(int n)
    {
        int i, j;
        // outer loop to handle number of rows
        for (i = 0; i < n; i++) {
            //  inner loop to handle number of columns
            for (j = 0; j < n; j++) {
                // star 
            
                if (i == 0 || j == 0 || i == n - 1
                    || j == n - 1) {
                    System.out.print("*");
                }
                //  print space only.
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
  
  
    public static void main(String args[])
    {
        int n = 6;
        printPattern(n);
    }
} 