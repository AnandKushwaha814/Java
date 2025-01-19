public class method {
    void add() {
        int a = 20, b = 30;
        int c = a + b;
        System.out.println("Sum " + c);
    }

    public static void main(String[] args) {
        method a = new method();
        a.Disp();
        a.add();
    }

    void Disp() {
        System.out.println("Hello World");
    }
}
