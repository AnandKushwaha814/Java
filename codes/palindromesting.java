import java.util.*;

public class palindromesting {
    public static void main(String[] args) {
        String orignal, reverse = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string/Numer: ");
        orignal = sc.nextLine();
        int length = orignal.length();
        for (int i = length - 1; i >= 0; i--)
            reverse = reverse + orignal.charAt(i);
        if (orignal.equals(reverse))
            System.out.println("p");
        else
            System.out.println("Not");
    }
}
