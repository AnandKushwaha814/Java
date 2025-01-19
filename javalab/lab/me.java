import java.util.*;
public class me {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of A: ");
        int a=sc.nextInt();
        System.out.println("Enter the vlaue of B: ");
        int b=sc.nextInt();
        int c=a-b;
        System.out.println("The Diff is: "+c);
        if(c>0){
            System.out.println("The diff is +v");
        }
        else{
            System.out.println("the sum is -v");
        }
    }
}
