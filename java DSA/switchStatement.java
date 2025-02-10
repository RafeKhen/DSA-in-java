import java.util.*;

public class switchStatement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        switch(num) {
            case 1: System.out.println("samosa");
                break;
            case 2: System.out.println("pizza");
                break;
            case 3: System.out.println("burger");
                break;
            default: System.out.println("Invalid choice");
        }
    }
}