import java.util.*;
public class matrix {

    public static void largest(int matrix[][]) {
        int largest = Integer.MIN_VALUE;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] > largest) {
                    largest = matrix[i][j];
                }
            }
        }
        System.out.println("Largest element is: "+largest);
        return;
    }

    // public static boolean search(int matrix[][], int key) {
    //     for (int i = 0; i < matrix.length; i++) {
    //         for (int j = 0; j < matrix[0].length; j++) {
    //             if (matrix[i][j] == key) {
    //                 System.out.println("Found at index ("+i+","+j+")");
    //                 return true;
    //             }
    //         }
    //     }
    //     System.out.println("Not found");
    //     return false;
    // }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int matrix[][] = new int[3][3]; 
        int n = matrix.length, m= matrix[0].length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                // System.out.print("Enter a value for index num ("+i+","+j+"): ");
                matrix[i][j] = sc.nextInt();
            }
        }

        // output
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j]+ " ");
            }
            System.out.println();
        }

        largest(matrix);
        sc.close();
    }
}