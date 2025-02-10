public class stair_case_search {

    public static boolean stairCaseSearch(int matrix[][], int key) {
        int row = 0, col = matrix[0].length - 1;
        int steps = 0;

        while (row < matrix.length && col >= 0) {
            if (matrix[row][col] == key) {
                System.out.println("key found at ("+row+", "+col+")");
                return true;
            }

            else if (key < matrix[row][col]) {      // move left
                col--;
            }
            else {
                row++;                              // move down
            }
            System.out.println("step no: "+steps);
            steps++;
        }



        // // hw
        // int row = matrix[0].length - 1, col = 0;
        // int steps = 0;
        // while (row < matrix.length && col >= 0) {
        //     if (matrix[row][col] == key) {
        //         System.out.println("key found at ("+row+", "+col+")");
        //         return true;
        //     }
        //     else if (key < matrix[row][col]) {
        //         row--;
        //     }
        //     else {
        //         col++;
        //     }
        //     System.out.println("step no: "+steps);
        //     steps++;
        // }
        System.out.println("key not found!");
        return false;
    }
    public static void main(String[] args) {
        int matrix[][] = {{10, 20, 30, 40},
                          {15, 25, 35, 45},
                          {27, 29, 37, 48},
                          {32, 33, 39, 50}};
        int key = 33;
        stairCaseSearch(matrix, key);

    }
}
