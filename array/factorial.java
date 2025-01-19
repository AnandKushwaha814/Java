import java.util.*;
public class factorial {
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        n=sc.nextInt();
        factorial r=new factorial();
        int resutl=r.fact(n);
        System.out.println("Factorial of given no is:"+resutl);
        
    }
    int fact(int n)
    {
        if(n==1)
        return 1;
        else
        return n*fact(n-1);
    }
}
