public class print_largest_string {
    public static void main(String[] args) {
        String fruit[] = {"apple", "mango", "banana"};

        String largest = fruit[0];

        for (int i = 0; i < fruit.length; i++) {
            if (largest.compareToIgnoreCase(fruit[i]) < 0) {
                largest = fruit[i];
            }
        }
        System.out.println(largest);
    }
}
