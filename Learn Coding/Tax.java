import java.util.*;
public class Tax {
    public static void main(String[] args) {
        int a;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Salary: ");
        int sal=sc.nextInt();
        if(sal<10000){
            System.out.println(sal+" "+"No tex");
        }else if(sal>=10000 & sal<=100000){
            a=sal*10/100;
            System.out.println(sal+" "+" "+a);
        }
        else{
            a=sal*20/100;
            System.out.println(sal+" "+" "+a);
        }
    }
    
}
