import java.util.*;

public class HowMethod {
    int a, b, add, sub, mult, div, rem;

    void input() {
        System.out.print("Enter Two Number: ");
        a = sc.nextInt();
        b = sc.nextInt();
    }

    void process() {
        add = a + b;
        sub = a - b;
        mult = a * b;
        div = a / b;
        rem = a % b;
    }

    void output() {
        System.out.println("Addition is: " + add);
        System.out.println("Subtraction is: " + sub);
        System.out.println("Multipication is: " + mult);
        System.out.println("Division is: " + div);
        System.out.println("Reminder is: " + rem);
    }

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        HowMethod r = new HowMethod();
        r.input();
        r.process();
        r.output();

    }
}
