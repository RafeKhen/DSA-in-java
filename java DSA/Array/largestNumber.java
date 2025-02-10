public class largestNumber {
    public static int getLar(int num[]) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        for (int i = 0; i < num.length; i++) {
            // largest value
            if (largest < num[i]) {
                largest = num[i];
            }

            // smallest value
            if (smallest > num[i]) {
                smallest = num[i];
            }
        }
        System.out.println("Smallest value is: "+ smallest);
        return largest;
    }

    public static void main(String[] args) {
        int num[] = {1, 2, 6, 3, 5};
        System.out.println("Largest Number is: "+ getLar(num));
    }
}
