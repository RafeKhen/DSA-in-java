import java.util.*;
public class binarySearch {

    public static int binSer(int num[], int key) {
        int start = 0, end = num.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            // comparisons
            if (num[mid] == key) {   
                return mid;
            }
            if (num[mid] < key) {   // right
                start = mid + 1;
            } else {    // left
                end = mid - 1;
            }
        }

        return -1;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.close();

        int num[] = {2, 4, 5, 6, 7, 8, 9, 12}; // Sorted array
        int key = 7;

        System.out.println("Index of " +key+ " is: "+ binSer(num, key));
    }
}