import java.util.*;
public class invertedHalf {
    public static void main(String[] args) {
        System.out.print("Enter a Number: ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }System.out.println();
        }
    }
}
