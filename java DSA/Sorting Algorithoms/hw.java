

// public class hw {

//     public static void bubbleSort(int arr[]) {
//         int swap = 0;
//         for (int turn = 0; turn < arr.length - 1; turn++) {
//             for (int j = 0; j < arr.length - 1 - turn; j++) {
//                 if (arr[j] > arr[j+1]) {
//                     //swap
//                     int temp = arr[j];
//                     arr[j] = arr[j+1];
//                     arr[j+1] = temp;

//                     swap++;
//                 }
//             }
//         }

//         for (int i = 0; i < arr.length; i++) {
//             System.out.print(arr[i]+ " ");
//         }
//         System.out.println("\nNumber of swap: "+swap);
//     }

//     // public static void printArr(int arr[]) {
//     //     for (int i = 0; i < arr.length; i++) {
//     //         System.out.print(arr[i]+ " ");
//     //     }
//     //     System.out.println();
//     // }
//     public static void main(String[] args) {
//         // int arr[] = {5, 4, 1, 3, 2};
//         int arr2[] = {1, 2, 3, 4, 5};
//         bubbleSort(arr2);
//         // printArr(arr);
//     }
// }




public class hw {

    public static void countingSort(int arr[], int maxValue) {
        // Create a count array to store the count of each unique number
        int count[] = new int[maxValue + 1];  // Assuming the range is 0 to maxValue

        // Initialize the count array
        for (int i = 0; i < count.length; i++) {
            count[i] = 0;
        }

        // Store the count of each element in the original array
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }

        // Overwrite the original array with sorted elements
        int index = 0;
        for (int i = 0; i <= maxValue; i++) {
            while (count[i] > 0) {
                arr[index++] = i;
                count[i]--;
            }
        }

        // Print the sorted array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {5, 4, 1, 3, 2};

        // Assuming the maximum value in the array is known (in this case, 5)
        int maxValue = 5;

        countingSort(arr, maxValue);
    }
}
