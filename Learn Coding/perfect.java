import java.util.*;
public class perfect {
    public static void main(String[] args) {
        int n,sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        n=sc.nextInt();
        for(int i=1;i<n;i++){
            if(n%i==0){
                sum=sum+i;
            }
        }  
        if(n==sum){
            System.out.println("perfecet no");
        }else
        System.out.println("Not perfect no");
    }
}
