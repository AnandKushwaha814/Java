import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        int n,s,c,rem,arm=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number: ");
        n=sc.nextInt();
        c=n;
        while(n>0)
        {
            rem=n%10;
            arm=(rem*rem*rem)+arm;                  //153=1*1*1+5*5*5+3*3*=153
            n=n/10;
        }
        if(c==arm){
            System.out.println("armstrong number");
        }else
        System.out.println("not armstrong no");
    }
}
