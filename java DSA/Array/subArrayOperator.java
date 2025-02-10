public class subArrayOperator {
    public static void printSubarrays(int[] arr) {
        int n = arr.length;
        int maxSum = Integer.MIN_VALUE;
        int minSum = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int sum = 0;
                System.out.print("Subarray: ");
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k] + " ");
                    sum += arr[k];
                }
                System.out.println(" | Sum: " + sum);

                // Update max and min sums
                if (sum > maxSum) {
                    maxSum = sum;
                }
                if (sum < minSum) {
                    minSum = sum;
                }
            }
        }

        System.out.println("Maximum Subarray Sum: " + maxSum);
        System.out.println("Minimum Subarray Sum: " + minSum);
    }

    public static void main(String[] args) {
        int[] numbers = {2, 4, 6, 8, 10};
        printSubarrays(numbers);
    }
}
