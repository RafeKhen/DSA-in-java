// import java.util.*;
// public class pattern {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the number of line: ");
//         int n = sc.nextInt();
//         for (int line = 1; line <= n; line++) {
//             for (int star = 1; star <= line; star++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }



// // print inverted star pattern
// import java.util.*;
// public class pattern {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the value of line: ");
//         int n = sc.nextInt();

//         for (int i = 1; i <= n; i++) {
//             for (int star = 1; star <= n-i+1; star++) {
//                 System.out.print("*");
//             }

//             System.out.println();
//         }
        
//     }
// }



// // print half piramid pattern
// import java.util.*;
// public class pattern {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter line num: ");
//         int n = sc.nextInt();

//         for (int i = 1; i <= n; i++) {
//             //print numbers
//             for (int number = 1; number <= i; number++) {
//                 System.out.print(number);
//             }
//             System.out.println();
//         }
//     }
// }




// print character pattern
import java.util.*;
public class pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a num: ");
        int n = sc.nextInt();
        char ch = 'A';

        //outer loop
        for (int line = 1; line <= n; line++) {
            //inner loop
            for (int chars = 1; chars <= line; chars++) {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}