// public class function {
//     public static void printHelloWorld() {
//         System.out.println("Hello World!");
//     }

//     public static void main(String[] args) {
//         printHelloWorld();  //function call
//     }
// }



// import java.util.*;
// public class function {
//     public static int calculateSum(int num1, int num2) {    // parameters or formal parameters
//         int sum = num1 + num2;
//         return sum;
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();

//         int sum = calculateSum(a, b);   //arguments or actual patameters
//         System.out.println(sum);
//     }
// }



// // Product of a & b
// import java.util.*;
// public class function {
//     public static int product(int a, int b) {
//         int  product = a * b;
//         System.out.println("Product is: "+ product);
//         return product;
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         product(a, b);
//     }
// }



// // find factorial
// import java.util.*;
// public class function {
//     public static int factorial(int a) {
//         int fac = 1;
//         for (int i = 1; i <= a; i++) {
//             fac *= i;
//         }
//         return fac;
//     }
//     // public static void main(String[] args) {
//         // Scanner sc = new Scanner(System.in);
//         // System.out.print("Enter a num: ");
//         // int a = sc.nextInt();
//         // int res = factorial(a);
//         // System.out.println("Factorial is: "+ res);
//         // System.out.println(factorial(5));
//     // }

// // Binomial Coefficient
//     public static int bioCoff(int n, int r) {
//         int fac_n = factorial(n);
//         int fac_r = factorial(r);
//         int nmr = factorial(n-r);

//         int bioCoff = fac_n / ( fac_r * nmr);
//         return bioCoff;
//     }
//     public static void main(String[] args) {
//         System.out.print(bioCoff(5, 2));
//     }
// }


// import java.util.*;
// public class function {
    // public static boolean isPrime(int n) {
    //     // boolean isPrime = true;
            // if(n == 2) {
            //     return true;
            // }
    //     for (int i = 2; i <= n-1; i++) {
    //         if (n % i == 0) {
    //             return false;
    //         }
    //     }

    //     return true;
    // }


//     public static boolean isPrime(int n) {
//         if (n == 2) {
//             return true;
//         }
//         for (int i = 2; i <= n-1; i++) {
//             if (n % i == 0) {
//                 return false;
//             }
//         }

//         return true;
//     }

//     public static void primesinRange(int n) {
//         for(int i = 2; i <= n; i++) {
//             if (isPrime(i)) {   // true
//                 System.out.print(i+ " ");
//             }
//         }
//         System.out.println();
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         // System.out.print("Enter a num: ");
//         // int n = sc.nextInt();
//         primesinRange(100);
//     }
// }





// // binary to decimal conversion
// import java.util.*;
// public class function {
//     public static void binToDec(int binNum) {
//         int mynum = binNum;
//         int pow = 0;
//         int decNum = 0;

//         while (binNum > 0) {
//             int lastDig = binNum % 10;  // get the last digit
//             decNum = decNum + (lastDig * (int)Math.pow(2, pow));

//             pow++;
//             binNum /= 10;   //remove the last digit
//         }
//         System.out.println("Decimal of "+ mynum+ " is = "+ decNum);
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         binToDec(111);
//     }
// }




// Decimallto binary conversion
import java.util.*;
public class function {

    public static void decToBin(int decNum) {
        int myNum = decNum;
        int pow = 0;
        int binNum = 0;

        while (decNum > 0) {
            int rem = decNum % 2;   // get last digit
            binNum = binNum + (rem * (int)Math.pow(10, pow));
            pow++;
            decNum /= 2;    // remove last digit
        }
        System.out.println("Binary form of "+myNum+ " is = "+ binNum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        decToBin(5);
    }
}