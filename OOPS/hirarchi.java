class a{
    void input(){
        System.out.println("ENter your name: ");
    }
}
class b extends a{
    void show(){
        System.out.println("My namr is Anand ");
    }
}
class c extends a{
    void disp(){
        System.out.println("my namr is Ajit");
    }
}
class hirarchi{
    public static void main(String[] args) {
        b r=new b();
        c r2=new c();
        r.input(); r.show();
        r2.input(); r2.disp();
    }
}