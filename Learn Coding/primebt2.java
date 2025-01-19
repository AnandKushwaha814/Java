import java.util.Scanner;

public class primebt2 {
    public static void main(String[] args) {
        int n, m,i,j;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first no: ");
        n = sc.nextInt();
        System.out.print("enter second no: ");
        m = sc.nextInt();
        for (i = n; i <= m; i++)
         {
            for (j = 2; j <= i; j++) 
            {
                if (i % j == 0) 
                    break;

                
             }
            if (i == j)
                System.out.println(j + " ");
        }
    }
}
