class A
{
    int age;
    String name;
    double b;

    A() {
        age = 21;
        name = "Anand";
        b = 1500.99;
    }

    A(int x) {
        age = x;
    }

    A(String y, double z) {
        name=y; b=z;
    }
}

public class ConstructorOverloding {
    public static void main(String[] args) {
        A r = new A();
        A r1 = new A(20);
        A r2 = new A("Kumar",15000);
        System.out.println(r.age+" "+r.name+" "+r.b);
        System.out.println(r1.age);
        System.out.println(r2.name+" "+r2.b);
    }
}
