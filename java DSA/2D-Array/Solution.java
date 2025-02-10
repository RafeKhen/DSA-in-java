public class Solution {
    public static void main(String[] args) {
        // Initialize original matrix
        int[][] matrix = { {1, 2}, {3, 4}, {5, 6} };

        // Row -> Column; Column -> Row
        int[][] transpose = new int[matrix[0].length][matrix.length];
        
        // Transpose the matrix
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }

        printMatrix(matrix);
        
        System.out.println();

        printMatrix(transpose);
    }

    public static void printMatrix(int[][] a_matrix) {
        for (int[] row : a_matrix) {
            for (int column : row) {
                System.out.print(column + " ");
            }
            System.out.println();
        }
    }
}
