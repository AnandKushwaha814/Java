import java.util.*;
public class insertArray {
    public static void main(String[] args) {
        int size,loc,item;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Size of array: ");
        size =sc.nextInt();
         int a[]=new int[size+1];
        System.out.println("Enter array element: ");
        for(int i=0;i<size;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.print("Enter array location: ");
        loc=sc.nextInt();
        System.out.print("Enter new element: ");
       item=sc.nextInt();
       for(int i=size;i>loc;i--){
        a[i]=a[i-1];
       }
       a[loc]=item;
       size++;
       for(int i=0;i<size;i++){
        System.out.println(a[i]+" ");
       }
    }
}
