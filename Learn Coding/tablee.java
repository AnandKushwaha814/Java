import java.util.Scanner;

public class tablee {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the limit (n): ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Multiplication table of " + i + ":");
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " * " + j + " = " + (i * j));
            }
        }
    }
}