public class lab3 {
    public static void main(String[] args) {
        int[] p = { 1, 2, 3, 4 };
        int[][] matrix = new int[p.length - 1][p.length -
                1];
        for (int i = 0; i < p.length - 1; i++) {
            matrix[i][i] = 0;
        }
        for (int l = 2; l <= p.length - 1; l++) {
            for (int i = 0; i <= p.length - l - 1; i++) {
                int j = i + l - 1;
                matrix[i][j] = Integer.MAX_VALUE;
                for (int k = i; k < j; k++) {
                    int minC = matrix[i][k] + matrix[k +
                            1][j] + p[i] * p[k + 1] * p[j + 1];
                    matrix[i][j] = Math.min(matrix[i][j],
                            minC);
                }
            }
        }
        for (int[] i : matrix) {
            for (int j : i) {
                System.out.print(j + "\t\t");
            }
            System.out.println();
        }
        int minMultiplications = matrix[0][p.length - 2];
        System.out.println("Multiplications needed: " + minMultiplications);
    }
}
