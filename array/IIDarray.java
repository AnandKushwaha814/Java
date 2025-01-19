import java.util.*;
public class IIDarray {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.print("Enter elelment: ");
        int a[][]=new int[2][2];
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        System.out.print("Matrix:\n");
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.print("\n");
        }
    }
}
