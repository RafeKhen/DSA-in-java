public class spiral {
    
    public static void printSpiral(int matrix[][]) {
        int startRow = 0, startCol = 0;
        int endRow = matrix.length - 1, endCol = matrix[0].length - 1;

        while (startRow <= endRow && startCol <= endCol) {
            //top
            for (int j = startCol; j <= endCol; j++) {
                System.out.print(matrix[startRow][j]+ " ");
            }

            //right
            for (int i = startRow + 1; i <= endRow; i++) {
                System.out.print(matrix[i][endCol]+ " ");
            }

            //bottom
            for (int j = endCol - 1; j >= startCol; j--) {
                if (startRow == endRow) {
                    break;
                }
                System.out.print(matrix[endRow][j]+ " ");
            }

            //left
            for (int i = endRow - 1; i >= startRow + 1; i--) {
                if (startCol == endCol) {
                    break;
                }
                System.out.print(matrix[i][startCol]+" ");
            }

            startCol++;
            startRow++;
            endCol--;
            endRow--;
        }

        System.out.println();
    }
    public static void main(String[] args) {
        int matrix[][] = new int[4][4]; // Corrected initialization
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

        printSpiral(matrix);
    }


    /*
    public static void printSpiral(int matrix[][]) {
        // Print the matrix in spiral order
        int top = 0, bottom = matrix.length - 1;
        int left = 0, right = matrix[0].length - 1;

        while (top <= bottom && left <= right) {
            // Print top row
            for (int i = left; i <= right; i++) {
                System.out.print(matrix[top][i] + " ");
            }
            top++;

            // Print right column
            for (int i = top; i <= bottom; i++) {
                System.out.print(matrix[i][right] + " ");
            }
            right--;

            // Print bottom row
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    System.out.print(matrix[bottom][i] + " ");
                }
                bottom--;
            }

            // Print left column
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    System.out.print(matrix[i][left] + " ");
                }
                left++;
            }
        }
    }
*/
}
