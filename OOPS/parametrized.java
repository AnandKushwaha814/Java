class a {
    int x, y;

    a(int a, int b) {
        x = a;
        y = b;
    }

    void show() {
        System.out.println(x + " " + y);
    }
}

public class parametrized {
    public static void main(String[] args) {

        a obj = new a(100, 200);
        obj.show();
    }
}