// import java.util.*;
public class hollo_Rhombus {

    public static void holRho(int n) {
        // outer loop
        for (int i = 1; i <= n; i++) {
            // inner loop
            // spaces
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }

            //star
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        holRho(5);
    }
}