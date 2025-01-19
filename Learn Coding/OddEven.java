                    // Odd NO: which number is not  divided by 2. 1 3 5 7 9
                    // Enen No; which numberi is divided by 2.   2 4 6 8...

import java.util.*;
public class OddEven {
    public static void main(String[] args) {
        int a;
        System.out.print("Enter the number: ");
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        if(a%2==0){
            System.out.println(a+" "+"Enen number");
        }else{
            System.out.println(a +" "+ "Odd number");
        }
    }
}
