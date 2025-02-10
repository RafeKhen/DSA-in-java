public class Diagonal_sum {

    public static int diagonalSum(int matrix[][]) {     
        int sum = 0;

        // // Primary diagonal                                  // O(n^2)
        // for (int i = 0; i < matrix.length; i++) {
        //     for (int j = 0; j < matrix[0].length; j++) {
        //         if (i == j) {
        //             sum += matrix[i][j];
        //         } else if (i+j == matrix.length-1) {
        //             sum += matrix[i][j];
        //         }
        //     }
        // }
        // return sum;



        // another way
        for (int i = 0; i < matrix.length; i++) {
            // primary diagonal
            sum += matrix[i][i];

            // secondary diagonal
            if (i != matrix.length -1-i) {
                sum += matrix[i][matrix.length -1-i];
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int matrix[][] = new int[3][3];
        int value = 1;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = value++;
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("Diagonal sum is: "+ diagonalSum(matrix));
    }
}
