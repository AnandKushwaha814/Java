import java.util.*;
public class threeGreatest {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first value: ");
        int a=sc.nextInt();
        System.out.print("Enter second value: ");
        int b=sc.nextInt();
        System.out.print("Enter third value: ");
        int c=sc.nextInt();
        if(a>b){
            if(a>c)
            {
                System.out.print("Greatesst valure is "+a);
            }
            else{
                System.out.println("Greatest value is "+c);
            }
        }
        else{
            if(b>c){
                System.out.println("greatest value is "+b);
            }
            else{
                System.out.println("greatest value is "+c);
            }
        }
    }
}
