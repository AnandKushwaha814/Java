import java.util.*;
public class fabonacci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int term,a=0,b=1,c;
        System.out.println("Enter term: ");
        term=sc.nextInt();
        System.out.println("Fibonacci Series IS: ");
        for(int i=0;i<=term;i++){
            System.out.print(a+" ");
            c=a+b;                      //for tribonacci series d=a+b+c;   a=b;  b=c;  c=d;
            a=b;
            b=c;
        }
    }
}
