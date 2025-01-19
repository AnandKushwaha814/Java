import java.util.*;
class Power{
    public static void main(String[] args) {
        int n,p,result=1;
        System.out.print("Enter a number: ");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        System.out.print("Enter power: ");
        p=sc.nextInt();
        for(int i=1;i<=p;i++){
            result=n*result;
        }
        System.out.println("power "+result);
    }
}
