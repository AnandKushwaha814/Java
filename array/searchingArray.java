import java.util.*;

public class searchingArray {
    public static void main(String[] args) {
        int count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size = sc.nextInt();
        System.out.print("Enter array element: ");
        int a[] = new int[size];
        for (int i = 0; i < size; i++) {
            a[i] = sc.nextInt();
        }
        System.out.print("Input array is: ");
        for (int i = 0; i < size; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.print("\n Enter searching element: ");
        int n = sc.nextInt();
        for (int i = 0; i < size; i++) {
            if (a[i] == n) {
                count++;
            }
        }
        if (count > 0)
            System.out.print("item found");
        else
            System.out.print("item not found");
    }

}
