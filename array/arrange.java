import java.util.*;

public class arrange {
    public static void main(String[] args) {
        int size,temp;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        size = sc.nextInt();
        System.out.print("Enter element: ");
        int a[] = new int[size];
        for(int i=0;i<size;i++){
            a[i]=sc.nextInt();
        }System.out.print("Entered array is: ");
        for(int i=0;i<size;i++){
            System.out.print(a[i]+" ");
        }
        for (int i=0;i<size;i++)
        {
            for(int j=i+1;j<size;j++){
                if(a[i]>a[j])               // for decending if(a[i]<a[j])
                {
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
         System.out.println("\nArrranged array is: ");
        for(int i=0;i<size;i++)
       
        {

            System.out.println(a[i]+" ");
        }
    }
}
