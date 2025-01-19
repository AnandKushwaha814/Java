import java.util.*;
public class solid {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("How many Rows print: ");
        int a=sc.nextInt();
        System.out.print("How Many Column Print: ");
        int b=sc.nextInt();
        //outer loop
        for(int i=1;i<=a;i++){
            //inner loop
            for(int j=1;j<=b;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
