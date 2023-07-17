package _2DArray;

public class SpiralMatrixprblm {

    public static void Spiral(int matrix[] ) {
        int startRow = 0;
        int startCol = 0;
        int endRow = matrix.length-1;
        int endCol = matrix[0].length-1;

        while( startRow <= endRow && startCol <= endCol){
        //top part
        for(int j=startCol; j<=endCol; j++){
            System.out.print(matrix[startRow] [j] +" ");
        }
        
        //right part
        for(int j=startRow; j<=endRow; j++){
            System.out.print(matrix[endCol][j] +" ");
        }

        //bottom part
        for(int j=endCol-1 ; j>=startRow ; j--){
              System.out.print(matrix[endRow][j] +" ");
        }

        //left part
        for(int i=endRow-1 ; i>=startRow+1 ; i--){
            System.out.print(matrix[startCol][i] +" ");
        }
        startRow++;
        startCol++;
        endCol--;
        endRow--;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int matrix[][] = {{1,2,3,4},
                          {5,6,7,8},
                          {9,10,11,12}, 
                          {13,14,15,16}};
        printSpiral(matrix);                  
    }  
    
}
