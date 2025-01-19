import java.util.*;
public class swap {
    public static void main(String[] args) {
        int a,b,temp;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Two Number: ");
        a=sc.nextInt();
        b=sc.nextInt();
        System.out.println("Beforr Swaping"+" "+a+" "+b);
        temp=a;                     //a=a+b
        a=b;                        //b=a-b;
        b=temp;                     //a=a-b;
        System.out.println("Afer Swaping"+" "+a+" "+b);
    }
}
