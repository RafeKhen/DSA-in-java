import java.util.*;
public class solid_Rhombus {

    public static void solidRhom(int n) {
        // outer loop
        for (int i = 1; i <= n; i++) {
            // inner loop
            // spaces
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            // rhombus
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        solidRhom(5);
        sc.close();
    }
}