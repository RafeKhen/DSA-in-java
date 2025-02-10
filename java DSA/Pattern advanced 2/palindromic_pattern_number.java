import java.util.*;
public class palindromic_pattern_number {

    public static void palinPn(int n) {
        // outer loop
        for (int i = 1; i <= n; i++) {
            // inner loop
            // spaces
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            // descending number
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }

            // ascending number
            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        palinPn(5);
        sc.close();
    }
}