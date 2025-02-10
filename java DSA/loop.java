// import java.util.*;

// public class loop {
//     public static void main(String args[]) {
//         int counter = 0;

//         while(counter < 10) {
//             System.out.println("Hello world!");
//             counter++;
//         }
        
//         System.out.println("printed hw 10x");
//     }
// }




// // print number from 1 to 10

// import java.util.*;

// public class loop {
//     public static void main(String args[]) {
//         int n = 0;
//         while(n <= 100) {
//             System.out.print(n +" ");
//             n++;
//         }
//     }
// }




// form 1 to n

// import java.util.*;

// public class loop {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Input a number: ");
//         int num = sc.nextInt();
//         int n = 0;

//         while(n <= num) {
//             System.out.print(n +" ");
//             n++;
//         }
//     }
// }





// // print the first n natural number

// import java.util.*;
// public class loop {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a number: ");
//         int num = sc.nextInt();
//         int sum;

//         while(sum <= num) {
//             System.out.println();
//         }
//     }
// }




// // sum of 1st n natural number

// import java.util.*;
// public class loop {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a number: ");
//         int num = sc.nextInt();
//         int sum = 0;

//         int i = 1;
//         while(i <= num) {
//             sum += i;
//             i++;
//         }
//         System.out.println("Sum = "+sum);
//     }
// }



// //print square pattern

// import java.util.*;
// public class loop {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
        
//         // for(int lines = 1; lines <= 4; lines++) {
//         //     System.out.println("****");
//         // }

//         int lines = 1;
//         while(lines <= 4) {
//             System.out.println("****");
//             lines++;
//         }
//     }
// }





// // print reverse of a number

// import java.util.*;
// public class loop {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter any number: ");
//         int n = sc.nextInt();

//         while(n > 0) {
//             int lastDigit = n % 10;
//             System.out.print(lastDigit);
//             n = n / 10;     // n /= 10;

//         }
//         System.out.println();
//     }
// }




// // reverse the given number

// import java.util.*;
// public class loop {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = 12332;
//         int rev = 0;

//         while (n > 0) {
//             int lastDigit = n % 10;
//             rev = (rev * 10) + lastDigit;
//             n /= 10;
//         }
//         System.out.println(rev);
//     }
// }




// // do while loop
// import java.util.*;
// public class loop {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int counter = 0;
//         do {
//             System.out.println("hello");
//             counter++;
//         }
//         while(counter <= 10);

//     }
// }




// // break statement
// import java.util.*;
// public class loop {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         for (int i = 1; i <= 5; i++) {
//             if (i == 3) {
//                 break;
//             }
//             System.out.println(i);
//         }
//         System.out.println("I am out");
//     }
// }



// // keep entering number till user enter a multiple of 10
// import java.util.*;
// public class loop {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
        
//         do {
//             System.out.print("Enter number:  ");
//             int n = sc.nextInt();
//             if (n % 10 == 0) {
//                 break;
//             }
//             System.out.println(n);
//         }
//         while(true);
//     }
// }



// // continue statement
// import java.util.*;
// public class loop {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         for (int i = 1; i <= 5; i++) {
//             if (i == 3) {
//                 continue;
//             }
//             System.out.println(i);
//         }
//     }
// }



// display all numbers entered by user except multiple of 10
import java.util.*;
public class loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Enter a number: ");
            int n = sc.nextInt();
            if (n % 10 == 0) {
                continue;
            }
            System.out.println(n);
        }
        while(true);
    }
}