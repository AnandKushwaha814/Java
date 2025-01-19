import java.util.*;

public class calculator {
    public static void main(String[] args) {
        System.out.println("Enter the value of A: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Enter the value of B:= ");
        int b = sc.nextInt();
        int ans;
        System.out.println("Enter The command (+,-,*,/,%):");
        char op = sc.next().charAt(0);
        switch (op) {
            case '+':
                ans = a + b;
                System.out.println("Sum is: " + ans);
                break;
            case '-':
                ans = a - b;
                System.out.println("Sub is: " + ans);
                break;
            case '*':
                ans = a * b;
                System.out.println("Multi is: " + ans);
                break;
            case '/':
                ans = a / b;
                System.out.println("Divid is: " + ans);
                break;
            case '%':
                ans = a % b;
                System.out.println("Mod is: " + ans);
                break;
            default:
                System.out.println("invalid option");
        }

    }
}
