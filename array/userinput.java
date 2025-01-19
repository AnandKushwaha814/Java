import java.util.Scanner;
public class userinput {
    public static void main(String[] args) {
        int size,i;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of array : ");
        size=sc.nextInt();
        System.out.print("Enter element: ");
        int a[]=new int[size];
        for(i=0;i<size;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("printed array element");
        for(i=0;i<size;i++){
            System.out.println(a[i]+" ");
            sc.close();
        }
    }
}
