public class palindrome {

    public static boolean isPalindrome(String str) {
        for (int i = 0; i < str.length() / 2; i++) {
            int n = str.length();
            if (str.charAt(i) != str.charAt(n - 1 - i)) {
                // Not a palindrome
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "madam";
        boolean result = isPalindrome(str);
        System.out.println("Is '" + str + "' a palindrome? " + result);
    }
}
