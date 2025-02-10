// /*
// Question 1: Print the number of 7's that are in the 2d array.
// Example:
// Input - int[][] array = {{4,7,8},{8,8,7}};
// Output - 2
//  */

// public class questions {

//     public static void countSeven(int matrix[][], int key) {
//         int count = 0;

//         for (int i = 0; i < matrix.length; i++) {
//             for (int j = 0; j < matrix[0].length; j++) {
//                 if (matrix[i][j] == key) {
//                     count++;
//                 }
//             }
//         }
//         System.out.println("key found "+count+" times.");
//     }
//     public static void main(String[] args) {
//         int matrix[][] = {{4, 7, 8},
//                           {8, 8, 7}};
//         int key = 7;
//         countSeven(matrix, key);
//     }
// }




/*
 Question 2: Print out the sum of the numbers in the second row of the "nums" array.

Example:
Input - int[][] nums = {{1,4,9},{11,4,3},{2,2,3}};
Output - 18

 */

//  public class questions {
//     public static int sumofSecondRow(int matrix[][]) {
//         int sum = 0;

//         for (int j = 0; j < matrix[1].length; j++) {
//             sum += matrix[1][j];
//             System.out.print(matrix[1][j]+" + ");
//         }
//         System.out.println("\nSum is: "+sum);
//         return sum;
//     }
//     public static void main(String[] args) {
//         int matrix[][] = {{1,4,9},{11,4,3},{2,2,3}};

//         sumofSecondRow(matrix);
//     }
//  }




/*
 Question 3: Write a program to Find Transpose of a Matrix
What is Transpose?
Transpose of a matrix is the process of swapping the rows to columns. For a 2x3 matrix,
 */

public class questions {

    public static void transpose(int matrix[][]) {
        // Calculate the dimensions of the original matrix
        int rows = matrix.length;
        int cols = matrix[0].length;

        // Create a new matrix to store the transpose
        int[][] transposeMatrix = new int[cols][rows];

        // Populate the transpose matrix
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transposeMatrix[j][i] = matrix[i][j];
            }
        }

        // Print the transpose matrix
        System.out.println("Transpose of the matrix:");
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(transposeMatrix[i][j] + " ");
            }
            System.out.println();
        }
    
    }
    public static void main(String[] args) {
        int matrix[][] = new int[2][3];
        int value = 1;

        // Fill the matrix with incremental values
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = value++;
            }
        }

        // Print the matrix
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        } 
        
        transpose(matrix);
    }
}