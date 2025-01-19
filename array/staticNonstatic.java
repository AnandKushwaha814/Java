public class staticNonstatic {
    int a = 20;
    static int b = 50;

    public static void main(String[] args) {
        staticNonstatic r = new staticNonstatic();
        r.Disp();
        staticNonstatic.Show();
    }

    static void Show() {
        System.out.println("Show()"+b);
    }

    void Disp() {
        System.out.println("disp()"+a + " " + b);
    }
}
