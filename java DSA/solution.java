import java.util.Scanner;

public class solution {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter a number: ");
            int num = sc.nextInt();

            for (int i = 1; i <= 10; i++) {
                int sum = i * num;
                System.out.println(i+ " x "+ num+ " = "+sum);
                // i++;
            }
            sc.close();

    }
}



