import java.util.*;
public class SumOddEven {
    public static void main(String[] args) {
        int sum=0;
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter Range: ");
        int a=sc.nextInt();
        if(a%2==0){
            for(int i=0;i<=a;i=i+2){
                sum=sum+i;
            }
            System.out.println("Even no is: "+sum);
        }else{
            for(int i=1;i<=a;i=i+2){
                sum=sum+i;
            }
            System.out.println("Sum of odd No is "+sum);
        }
    }
}
