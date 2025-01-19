class a{        //super class
    int a,b,c;
    void add(){
        a=20;b=30;
        c=a+b;
        System.out.println("Sum is "+c);
    }
    void sub(){
        a=50;b=20;
        c=a-b;
        System.out.println("Substraction is "+c);
    }
}
class b extends a{      //sub class
    void mult(){
        a=10;b=21;
        c=a*b;
        System.out.println("Multiplication is "+c);
    }
    void div(){
        a=60;b=10;
        c=a/b;
        System.out.println("Division is "+c);
    }
}
class c extends b{      //sub class
    void rem(){
        a=100;b=20;
        c=a%b;
        System.out.println("reminder is "+c);
    }
}

class multilevel {
    public static void main(String[] args) {
        c r=new c();
        r.add();
        r.sub();
        r.mult();
        r.div();
        r.rem();
    }    
}
