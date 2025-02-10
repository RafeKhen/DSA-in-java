public class linearSearch {
    public static int linSea(int num[], int key) {

        for (int i = 0; i < num.length; i++) {
            if (num[i] == key) {
                return i;
            }

        }
        
        return -1;
    }

    public static void main(String args[]) {
        int num[] = {2, 4, 6, 8, 10, 12};
        int key = 10;

        int indx = linSea(num, key);
        if (indx == -1) {
            System.err.println("Not found.");
        } else {
            System.out.println("Key is at indx:" +indx);
        }
    }
}
