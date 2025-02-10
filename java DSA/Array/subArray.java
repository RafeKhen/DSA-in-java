public class subArray {
    public static void printsubA(int num[]) {
        int total = 0;

        for (int i = 0; i < num.length; i++) {
            int start = i;
            for (int j = i; j < num.length; j++) {
                int end = j;
                
                // print sun array
                for (int k = start; k <= end; k++) {
                    System.out.print(num[k]+ " ");
                }
                total++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total sub array: "+total);
    }

    public static void main(String[] args) {
        int numbers[] = {2, 4, 6, 8, 10};
        printsubA(numbers);
    }
}
