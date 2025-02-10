// Count how many times lowercase vowels occurred in a String entered by the user.
// import java.util.*;
// public class questions {

//     public static int countVowels(String str) {
//             int count = 0;
//             for (int i = 0; i < str.length(); i++) {
//                 char ch = str.charAt(i);
//                 if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
//                     count++;
//                 }
//             }
//             System.out.println("Numbers of vowels are: "+count);
//             return count;
//         }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String str = "";
//         System.out.println("Enter random string: ");
//         str = sc.next();
//         countVowels(str);
//     }
// }


import java.util.*;
public class questions {

//     public static void main(String[] args) {
//         System.out.println("Enter a random string:");
//         String str = new Scanner(System.in).next();
//         int count = 0;

//         for (int i = 0; i < str.length(); i++) {
//             char ch = str.charAt(i);
//             if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
//                 count++;
//             }
//         }
//         System.out.println("count of vowels is: "+count);
//     }






// Question 2: What will be the output of the following code?

    // public static void main(String args[]) {
    //     String str = "ShradhaDidi";
    //     String str1 = "ApnaCollege";
    //     String str2 = "ShradhaDidi";
    //     System.out.println(str.equals(str1) + " " + str.equals(str2));
    // }





    // Question 3: What will be the output of the following code?
    // public static void main(String[] args) {
    //     String str = "ApnaCollege".replace("l", "");
    //     System.out.println(str);
    // }




    //Question 4: Determine if 2 Strings are anagrams of each other.

// What are anagrams?
// If two strings contain the same characters but in a different order, they can be said to be anagrams. Consider race and care. In this case, race's characters can be formed into care, or care's characters can be formed into race. Below is a java program to check if two strings are anagrams or not.

    public static void main(String[] args) {
        String str1 = "earth";
        String str2 = "heart";
    
        // Convert Strings to lowercase. Why? So that we don't have to check separately for lower & uppercase.
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
    
        // First check - If the lengths are the same
        if (str1.length() == str2.length()) {
            // Convert strings into char array
            char[] str1charArray = str1.toCharArray();
            char[] str2charArray = str2.toCharArray();
    
            // Sort the char array
            Arrays.sort(str1charArray);
            Arrays.sort(str2charArray);
    
            // If the sorted char arrays are same or identical then the strings are anagrams
            boolean result = Arrays.equals(str1charArray, str2charArray);
    
            if (result) {
                System.out.println(str1 + " and " + str2 + " are anagrams of each other.");
            } else {
                System.out.println(str1 + " and " + str2 + " are not anagrams of each other.");
            }
        } else {
            // Case when lengths are not equal
            System.out.println(str1 + " and " + str2 + " are not anagrams of each other.");
        }
    }
    
}