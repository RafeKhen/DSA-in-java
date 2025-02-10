// // Question 1 : Write a Java method to compute the average of three numbers.

// import java.util.*;
// public class funQues {

//     public static double avrOf3Num(double i, double j, double k) {
//         double sum = (i + j + k) / 3;
//         return sum;
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         // System.out.println(avrOf3Num(1, 2, 3));
//         System.out.print("Enter 1st num: ");
//         double a = sc.nextDouble();
//         System.out.print("Enter 2st num: ");
//         double b = sc.nextDouble();
//         System.out.print("Enter 3st num: ");
//         double c = sc.nextDouble();

//         System.out.println("\nAvarage is = "+ avrOf3Num(a, b, c));
//     }
// }




// // Question 2: Write a method named isEven that accepts an int argument. The method should return true if the argument is even, or false otherwise.
// // Also, write a program to test your method.

// import java.util.*;
// public class funQues {

//     public static boolean isEven(int n) {
//         return n % 2 == 0;
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter only even num: ");
//         int n = sc.nextInt();
//         if (isEven(n)) {
//             System.out.println("Number is even.");
//         } else {
//             System.out.println("Number is odd.");
//         }
//     }
// }




// // Question 3 : Write a Java program tocheckif a number is a palindrome in Java? ( 121 is a palindrome, 321 is not)
// import java.util.*;
// public class funQues {

//     public static boolean isPolind(int n) {
//         int original = n;
//         int revesed = 0;

//         while (n != 0) {
//             int rem = n % 10;
//             revesed = revesed * 10 + rem;
//             n /= 10;
//         }
//         return original == revesed;
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Try to gess a polindrome: ");
//         int a = sc.nextInt();
//         isPolind(a);

//         if (isPolind(a)) {
//             System.out.println(a + " is a palindrome.");
//         } else {
//             System.out.println(a + " is not a palindrome.");
//         }
//     }
// }



// Question 5: Write a Java method to compute the sum of the digits in an integer.
import java.util.*;
public class funQues {

    public static int sumDigist(int n) {
        int sumOfDig = 0;
        while (n > 0) {
            int rem = n % 10;
            sumOfDig += rem;
            n /= 10;
        }
        return sumOfDig;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer (Enter 0 to exit): ");
        int n = sc.nextInt();

        System.out.println("The sum is: "+ sumDigist(n));
    }
}
