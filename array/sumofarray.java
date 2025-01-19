import java.util.*;

public class sumofarray {
    public static void main(String[] args) {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size of Array: ");
        int size = sc.nextInt();
        System.out.println("Enter elemet: ");
        int n[] = new int[size];
        for (int i = 0; i <size; i++) {
            n[i] = sc.nextInt();
        }
        System.out.println("array element");
        for (int i = 0; i <size; i++) {
            System.out.println(n[i] + " ");
            sum = n[i] + sum;
        }
        System.out.println("\n Sum of array is: "+sum);
    }
}
