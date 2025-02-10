public class max_subArray_sum_bruteForce {
    public static void maxSubAsum(int num[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < num.length; i++) {
            // int start = i;
            for (int j = i; j < num.length; j++) {
                // int end = j;
                currSum = 0;
                // print sun array
                for (int k = i; k <= j; k++) {
                    currSum += num[k];
                }

                System.out.println(currSum);
                if (maxSum < currSum) {
                    maxSum = currSum;
                }
            }
        }
        System.out.println("Max sum: "+maxSum);
    }

    public static void main(String[] args) {
        int numbers[] = {1, -2, 6, -1, 3};
        maxSubAsum(numbers);
    }
}
