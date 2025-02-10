// // Question1: WriteaJavaprogramtogetanumberfromtheuserandprintwhether it is positive or negative.

// import java.util.*;

// public class csq {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter any number: ");
//         int num = sc.nextInt();

//         String type = num >= 0 ? "positive" : "negative";
//         System.out.println(type);
//     }
// }



// /*  Question2: Finish the following code so that it prints You have a fever 
// if your temperature is above 100 and otherwise prints You don't have a fever.
// */

// import java.util.*;

// public class csq {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter your temperature: ");
//         double temp = sc.nextInt();

//         if (temp >= 100) {
//             System.out.println("You have a fever");
//         }
//         else {
//             System.out.println("You don't have a fever");
//         }
//     }
// }




// // Question3: Write a Javaprogram to input weeknumber (1-7) and print day of week name using switch case.

// import java.util.*;

// public class csq {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter week number (1-7): ");
//         int week = sc.nextInt();

//         switch(week) {
//             case 1 : System.out.println("Saturday");
//                 break;
//             case 2 : System.out.println("Sunday");
//                 break;
//             case 3 : System.out.println("Monday");
//                 break;
//             case 4 : System.out.println("Tuesday");
//                 break;

//             case 5 : System.out.println("Wednesday");
//                 break;

//             case 6 : System.out.println("Thursday");
//                 break;

//             case 7 : System.out.println("Friday");
//                 break;

//             default : System.out.println("Invalid!");
//         }
//     }
// }




// //  Question 4 :What will be the value of x & y in thefollowing program:

// import java.util.*;
// public class csq {
//     public static void main(String args[]) {
//         int a = 63, b = 36;
//         boolean x = (a < b) ? true : false;
//         System.out.println("x = "+ x);

//         int y = (a > b) ? a : b;
//         System.out.println("y = "+ y);
//     }
// }





// Question5: Write a Javaprogram that takes a year from the user and print whether that year is a leap year or not.

import java.util.*;

public class csq {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        boolean x = (year % 4 == 0);
        boolean y = (year % 100 != 0);
        boolean z = (year % 100 == 0) && (year % 400 == 0);

        if (x && (y || z)) {
            System.out.println("Its s leap year.");
        }
        else {
            System.out.println("Not a leap year.");
        }
    }
}