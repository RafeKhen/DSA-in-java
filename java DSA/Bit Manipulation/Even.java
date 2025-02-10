public class Even {
    public static void evenOrOdd(int n) {
        int bitMask = 1;
        if ((n & bitMask) == 0) {
            System.out.println("Even");
        } else {
            System.out.println("odd");
        }
    }
    public static void main(String[] args) {
        evenOrOdd(101);
        evenOrOdd(100);
        evenOrOdd(011);

    }
}
