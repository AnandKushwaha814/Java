import java.util.*;

public class userinput {
    public static void main(String[] args) {
        System.out.println("Taking Input form User");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of A:= ");
        int a = sc.nextInt();
        System.out.println("Enter the value of B:= ");
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println("The sum of A and B is:= ");
        System.out.println(sum);
    }
}
