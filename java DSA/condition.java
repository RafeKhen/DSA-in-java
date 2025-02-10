// import java.util.*;

// public class condition {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter your age : ");
//         int age = sc.nextInt();

//         if (age >= 18) {
//             System.out.println("You are a adult.");
//         }

//         else if(age > 13 && age < 18) {
//             System.out.println("You are a teenager.");
//         }

//         else {
//             System.out.println("You are not adult.");
//         }
// }
// }





// // larger of 2 numbers

// import java.util.*;

// public class condition {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the value of a : ");
//         int a = sc.nextInt();

//         System.out.print("Enter the value of b : ");
//         int b = sc.nextInt();

//         if (a < b) {
//             System.out.println("\nLarger number is b: " + b );
//         }

//         else {
//             System.out.println("\nLarger number is a: " + a );
//         }
//     }
// }



// // check if number is odd or even

// import java.util.*;

// public class condition {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a number: ");
//         int num = sc.nextInt();

//         if(num % 2 == 0) {
//             System.out.println("\nThe number is even.");
//         } 
        
//         else {
//             System.out.println("\nThe number is odd.");
//         }
//     }
// }




// // income tax calculation

// import java.util.*;

// public class condition {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter your income: ");
//         int income = sc.nextInt();
//         int tax;

//         if (income < 500000) {
//             tax = 0;
//         } 
//         else if (income <= 1000000) {
//             tax = (int) (income * 0.2);
//         } 
//         else if (income <= 2000000) {
//             tax = (int) (income * 0.3);
//         } 
//         else {
//             tax = (int) (income * 0.4); // Optional: You can add an additional bracket if needed
//         }

//         System.out.println("\nYour tax is: " + tax);
//     }
// }




// // greatest of 3 numbers

// import java.util.*;

// public class condition {
//     public static void main(String args[]) {
//         int a = 3;
//         int b = 4;
//         int c = 5;

//         if (a >= b && a >= c) {
//             System.out.println(a);
//         }
//         else if (b >= a && b >= c) {
//             System.out.println(b);
//         }
//         else {
//             System.out.println(c);
//         }
//     }
// }



import java.util.*;

public class condition {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter mark: ");
        int mark = sc.nextInt();

        String reportCard = mark >= 33 ? "pass" : "fail";
        System.out.println("Report Card: " + reportCard);
    }
}