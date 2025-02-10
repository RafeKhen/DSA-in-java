public class twoDarray {
    public static void main(String[] args) {
        int matrix[][] = new int[3][3];
        int value = 1;
        // int n = matrix.length; m = matrix[0].length;

        // Fill the matrix with incremental values
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = value++;
            }
        }

        // print the matrix
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}