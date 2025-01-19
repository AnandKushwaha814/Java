import java.util.*;
public class VowelConsonant {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter any Character: ");
        char ch=sc.next().charAt(0);
        if(ch=='a' || ch=='A' || ch=='e' || ch=='E' || ch=='i' || ch=='I' || ch=='o' || ch=='O' || ch=='U' || ch=='u'){
            System.out.println("Enter character is vowel");
        }else
        {
            System.out.println("Entered character is consonat");
        }
    }
}
