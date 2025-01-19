class A{
    int a; int b;
    void show(){
        a=50;b=60;
        System.out.println(a+" "+b);
    }
    A(){
        a=10;b=20;
        System.out.println(a+" "+b);
    }
    {
        a=30;b=40;
        System.out.println(a+" "+b);
    }
}

public class instance {
    public static void main(String[] args) {
        A r=new A();
        r.show();
    }
}
