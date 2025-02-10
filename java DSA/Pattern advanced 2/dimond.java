// import java.util.*;
public class dimond {

    public static void dim(int n) {
        // outer loop 
        // 1st half
        for (int i = 1; i <= n; i++) {
            //inner loop
            //spaces
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }

            //star
            for (int j = 1; j <= 2*i-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 2nd half
        for (int i = n; i >= 0; i--) {
            //inner loop
            //spaces
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }

            //star
            for (int j = 1; j <= 2*i-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        dim(7);
    }
}