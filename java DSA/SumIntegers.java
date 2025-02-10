import java.util.*;
public class SumIntegers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int n;

        System.out.println("Enter integers one by one (Enter 0 to stop):");

        while (true) {
            n = sc.nextInt();
            if (n == 0) {
                break;
            }
            sum += n;
        }

        System.out.println("The total sum is: " + sum);
    }
}
