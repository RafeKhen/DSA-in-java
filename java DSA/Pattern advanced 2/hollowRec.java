import java.util.*;
public class hollowRec {

    public static void holRec(int totRows, int totCols) {
        // outer loop
        for ( int i = 1; i <= totRows; i++) {
            //iner loop
            for (int j = 1; j <= totCols; j++) {
                //cell (i, j)
                if (i == 1 || i == totRows || j == 1 || j == totCols) {
                    // boundry cell
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int a = sc.nextInt();
        System.out.print("Enter the number of colums: ");
        int b = sc.nextInt();
        holRec(a, b);
        sc.close();
        
    }
}