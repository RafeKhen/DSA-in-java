public class maxSum_three_kadanes {
    public static void kadanes(int num[]) {
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;

        for (int i = 0; i < num.length; i++) {
            currSum = currSum + num[i];

            if (currSum < 0) {
                currSum = 0;
            }
            maxSum = Math.max(currSum, maxSum);
        }
        System.out.println("Max subarray sum is: "+ maxSum);
    }

    public static void main(String[] args) {
        int numbers[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        kadanes(numbers);
    }
}
