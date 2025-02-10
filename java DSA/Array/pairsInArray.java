public class pairsInArray {
    public static void printPair(int num[]) {
        int totPair = 0;

        for (int i = 0; i < num.length; i++) {
            int curr = num[i];

            for (int j = i+1; j < num.length; j++) {
                System.out.print("("+curr+","+ num[j]+ ")");
                totPair++;
            }
            System.out.println();
        }
        System.out.println("Total pair is: "+ totPair);
    }

    public static void main(String[] args) {
        int numbers[] = {2, 4, 6, 8, 10};

        printPair(numbers);
    }
    
}
