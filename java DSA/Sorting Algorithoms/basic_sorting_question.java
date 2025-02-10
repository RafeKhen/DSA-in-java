// Question: Use the following sorting algorithms to sort an array in DESCENDING order:

// Bubble Sort
// Selection Sort
// Insertion Sort
// Counting Sort
// Example: You can use this array as an example: [3, 6, 2, 1, 8, 7, 4, 5, 3, 1]


public class basic_sorting_question {

    // Bubble sort
    public static void bubbleSort(int arr[]) {
        // Outer loop for each pass
        for (int turn = 0; turn < arr.length - 1; turn++) {
            // Inner loop for comparing adjacent elements
            for (int j = 0; j < arr.length - 1 - turn; j++) {
                // Swap if the current element is greater than the next element
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Selection sort
    public static void seletionSort(int arr[]) {
        int n = arr.length;

        // one by one move to the boundary of unsorted subarry
        for (int i = 0; i < n - 1; i++) {
            // Find the minimum element in the remaining unsorted array
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] > arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap the found minimum element with the first element
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    // Insertion sorting
    public static void insertionSort(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int curr = arr[i];
            int prev = i - 1;

            while (prev >= 0 && arr[prev] < curr) {
                arr[prev+1] = arr[prev];
                prev--;
            }

            // insertion
            arr[prev+1] = curr;
        }
    }
    

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void countingSort(int arr[]) {
        int largest = Integer.MIN_VALUE;

        //Finding the largest element in the array
        for (int i = 0; i < arr.length; i++) {
            largest = Math.max(largest, arr[i]);
        }

        // create a count array to store the count of each unique element
        int count[] = new int[largest+1];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }

        // sort the array using count array
        int j = 0;
        for (int i = count.length-1; i >= 0; i--) {
            while (count[i] > 0) {
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {3, 6, 2, 1, 8, 7, 4, 5, 3, 1};
        // bubbleSort(arr);
        // seletionSort(arr);
        // insertionSort(arr);
        countingSort(arr);
        printArr(arr);
    }
}
