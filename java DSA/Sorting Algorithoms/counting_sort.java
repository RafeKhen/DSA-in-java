public class counting_sort {

    // Function to perform counting sort
    public static void countingSort(int arr[]) {
        int largest = Integer.MIN_VALUE;

        // Find the largest element in the array
        for (int i = 0; i < arr.length; i++) {
            largest = Math.max(largest, arr[i]);
        }

        // Create a count array to store the count of each unique element
        int count[] = new int[largest + 1];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }

        // Sort the array using the count array
        int j = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                arr[j] = i;
                j++;
                count[i]--;
            }
        }

        // Print the sorted array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Main method to test the counting sort function
    public static void main(String[] args) {
        int arr[] = {1, 4, 1, 3, 2, 4, 3, 7};
        countingSort(arr);
    }
}
