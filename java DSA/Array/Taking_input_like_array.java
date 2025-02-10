import java.util.ArrayList;
import java.util.Scanner;

public class Taking_input_like_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> array = new ArrayList<>();
        
        System.out.println("Enter the elements of the array (enter 0 to exit): ");
        while (true) {
            int element = sc.nextInt();
            if (element == 0) {
                break;
            }
            array.add(element);
        }
        
        System.out.println("The elements of the array are: ");
        for (int elem : array) {
            System.out.print(elem + " ");
        }
        
        sc.close();
    }
}

