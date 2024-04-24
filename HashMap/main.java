public class main {
    
        final static int INF = Integer.MAX_VALUE; 
        // O(n^3) 
        int[][] floydWarshall(int A[][]) { 
        int n = A.length; 
        int D[][] = createDistanceMatrix(A, n); 
        for (int k = 0; k < n; k++) { 
        for (int i = 0; i < n; i++) { 
        for (int j = 0; j < n; j++) { 
        if (D[i][k] < INF && D[k][j] <
        INF) D[i][j] = Math.min(D[i][j], D[i][k] + D[k][j]); 
        } 
        } 
        } 
        return D; 
        } 
        // O(n^2) 
        int[][] createDistanceMatrix(int A[][], int n) { 
        int D[][] = new int[n][n]; 
        for (int i = 0; i < n; i++) { 
        for (int j = 0; j < n; j++) { 
        if (i == j) 
        D[i][j] = 0; 
        else if (A[i][j] == 0)
}
        }
