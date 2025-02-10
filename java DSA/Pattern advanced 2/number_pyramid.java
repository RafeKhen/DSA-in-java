import java.util.*;
public class number_pyramid {

    public static void numPyr(int n) {
        // outer loop
        for (int i = 1; i <= n; i++) {
            //inner loop
            // spaces
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            // number
            for (int j = 1; j <= i; j++) {
                System.out.print(i+ " ");
                
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        numPyr(5);
        sc.close();
    }
}