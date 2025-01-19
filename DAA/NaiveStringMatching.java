import java.util.Scanner;

public class NaiveStringMatching {
    public static void naive(String str1, String str2) {
        int a = str1.length();
        int b = str2.length();

        for (int i = 0; i < a; i++) {
            int j;
            for (j = 0; j < b; j++) {
                if (str1.charAt(i + j) != str2.charAt(j))
                    break;
            }
            if (j == b) {
                System.out.println("String Matches");
                return;
            }
        }

        System.out.println("String does not Match");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the First String: ");
        String str1 = scanner.nextLine();

        System.out.print("Enter the Second String: ");
        String str2 = scanner.nextLine();

        naive(str1, str2);
    }
}
