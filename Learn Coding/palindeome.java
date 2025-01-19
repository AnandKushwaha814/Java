import java.util.*;

public class palindeome {
    public static void main(String[] args) {
        int n, s = 0, r, c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        n = sc.nextInt();
        c = n;
        while (n > 0) {
            r = n % 10;
            s = (s * 10) + r;
            n = n / 10;
        }
        if (c == s) {
            System.out.println("palindrome no");
        
        }else{
                System.out.println("not palindeome no");
            }
    }
}
