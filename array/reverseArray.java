import java.util.*;
public class reverseArray {
    public static void main(String[] args) {
        int size,i;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of array: ");
        size=sc.nextInt();
        System.out.print("Enter Array Element: ");
        int a[]=new int[size];
        for(i=0;i<size;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Array element  ");
        for(i=0;i<a.length;i++){
            System.out.println(a[i]+" ");
        }
        System.out.println("\n Array reversed order");
        for(i=a.length-1;i>=0;i--)
        {
            System.out.println(a[i]+" ");
        }

    }
}
