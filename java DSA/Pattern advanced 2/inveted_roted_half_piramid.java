import java.util.*;
public class inveted_roted_half_piramid {

    public static void invRhP(int n) {
        //outer loop
        for (int i = 1; i <= n; i++) {
            // spaces
            //inner loop
            for (int j = 1; j <= n-i; j++) { 
                System.out.print(" ");
            }

            //star
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        invRhP(4);
        sc.close();
    }
}