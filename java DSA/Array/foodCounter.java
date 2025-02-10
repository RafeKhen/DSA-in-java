import java.util.Scanner;

public class foodCounter {
    public  static int fdCr(String menu[], String key) {
        for (int i = 0; i < menu.length; i++) {
            if (menu[i].equals(key)) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String menu[] = {"rice", "fish", "meat", "vegis", "coffee", "tea"};
        System.out.print("What do you want (\"rice\", \"fish\", \"meat\", \"vegis\", \"coffee\", \"tea\"): ");
        String key = sc.nextLine();
        sc.close();

        int indx = fdCr(menu, key);

        if (indx == -1) {
            System.out.println("Not in menu.");
        } else {
            System.out.println("Enjoy your "+ key);
        }
    }
}
