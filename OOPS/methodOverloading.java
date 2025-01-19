class a {
    int add()
    // void add()
    {
        int a, b, c;
        a = 10;
        b = 20;
        c = a + b;
        // System.out.println(c);
        return c;
    }

    void add(int x, int y) {
        int c;
        c = x + y;
        System.out.println(c);
    }

    void add(int x, double z) {
        double c;
        c = x + z;
        System.out.println(c);
    }
}

public class methodOverloading {
    public static void main(String[] args) {
        a r = new a();
        r.add();
        r.add(30, 40);
        r.add(50, 25);
        int add = r.add();
        System.out.println(add);
    }
}
