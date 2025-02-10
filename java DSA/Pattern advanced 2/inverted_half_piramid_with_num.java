import java.util.*;
public class inverted_half_piramid_with_num {

    public static void invHPN(int n) {
        // // going 1st to last
        // // outter loop
        // for (int i = 1; i <= n; i++) {
        //     // inner loop number
        //     for (int j = 1; j <= n-i+1; j++) {
        //         System.out.print(j);
        //     }

        //     System.out.println();

        // }

        // from last to 1st
        //outer loop
        for (int i = n; i >= 1; i--) {
            //inner loop
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        invHPN(5);
        sc.close();
        
    }
}