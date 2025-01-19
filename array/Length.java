import java.util.*;

public class Length {
    

    private static int i;

    public static void main(String[] args) {
        int a[] = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter element: ");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Array element: ");
        for (int i = 0; i < a.length; i++);
        {
            System.out.println(a[i] + " ");
        }
        System.out.println("Array of length is "+a.length);
    }
}
