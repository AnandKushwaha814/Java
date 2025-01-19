import java.util.*;
public class table {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Which Number you want to print Table Please Enter: ");
        int n=sc.nextInt();
        System.out.println("Table of "+n);
       //1 System.out.println("Table of "+n+"*");
        for(int i=1;i<11;i++){
            System.out.println(n+"*"+i+"="+n*i);
        }
    }
}
