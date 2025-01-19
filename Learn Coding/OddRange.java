import java.util.*;
public class OddRange {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter range: ");  //odd Number is which is not divided by 2. 1,3,5,7,9
        int a=sc.nextInt();
        for(int i=1;i<=a;i=i+2){
        //for(int i=0;i<=a;i=i+2){   // Even NO : which number is divided by 2
            System.out.println(i);
        }
    }
}
