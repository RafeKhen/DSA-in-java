// //  Question 1 : How many times 'Hello' is printed?
// public class loopqs {
//     public static void main(String[] args) {
//         for (int i = 0; i < 5; i++) {
//             System.out.println(i);
//             i += 2;
//         }
//     }
// }



// // Question2: Write a program that reads aset of integers,and then prints the sum of the  even and odd integers.
// import java.util.*;
// public class loopqs {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int sumEven = 0;
//         int sumOdd = 0;
//         System.out.print("Enter integers (type '0' to end): ");
//         while (true) {
//             int num = sc.nextInt();
//             if (num == 0) {
//                 break;
//             }
//             if (num % 2 == 0) {
//                 sumEven += num;
//             }
//             else {
//                 sumOdd += num;
//             }
//         }

//         System.out.println("Sum of even int: "+ sumEven);
//         System.out.println("Sum of odd int: "+ sumOdd);
//     }
// }



// // another way
// import java.util.*;
// public class loopqs {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int num;
//         int choice;
//         int sumEven = 0, sumOdd = 0;
        
//         do {
//             System.out.print("Enter a number: ");
//             num = sc.nextInt();
//             if (num % 2 == 0) {
//                 sumEven += num;
//             } else {
//                 sumOdd += num;
//             }

//             System.out.println("Enter 1 to continue, 0 to exit");
//             choice = sc.nextInt();
//         } while (choice == 1);

//         System.out.println("Even sum is: "+ sumEven);
//         System.out.println("Even sum is: "+ sumOdd);
//     }
// }




// // Question 3 :Write a program to find the factorialof any number entered by the user.
// import java.util.*;
// public class loopqs {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int num;        //to hold number
//         int fact = 1;   //to hold factorial

//         System.out.print("Enter any positive integer: ");
//         num = sc.nextInt();

//         for (int i = 1; i <= num; i++) {
//             fact *= i;
//         }

//         System.out.println("factorial is: "+ fact);
//     }
// }


// // another way
// import java.util.*;
// public class loopqs {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int num;
//         int fact = 1;

//         System.out.print("Enter a positive int: ");
//         num = sc.nextInt();

//         for (int i = num; i >= 1; i--) {
//             fact *= i;
//         }
//         System.out.println("Factorial: "+ fact);
//     }
// }




// Question 4: Write a program to print the multiplication table of a number ( N ), entered by the user.
import java.util.*;
public class loopqs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int mul;
        System.out.print("Enter a number which multiplication table you want: ");
        n = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            mul = n * i;
            System.out.println(n+" * "+i +" = "+mul);

        }

    }
}