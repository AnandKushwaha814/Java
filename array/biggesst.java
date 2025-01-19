import java.util.*;
public class biggesst {
    public static void main(String[] args) {
        int size,max;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of array: ");
        size=sc.nextInt();
        System.out.print("Enter array element: ");
        int a[]=new int[size];
        for(int i=0;i<size;i++){
            a[i]=sc.nextInt();
        }
        System.out.print("Entered array is: ");
        for(int i=0;i<size;i++){
            System.out.print(a[i]+" ");
        }
        max=a[0];
        for(int i=0;i<size;i++)
        {
            if(a[i]>max)
            {
                max=a[i];
            }
        }
        System.out.print("\nMaximum element is "+max);
    }
}
