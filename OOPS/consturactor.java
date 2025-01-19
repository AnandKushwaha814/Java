class b{
    int age;
    String name;
    b(){
        age=19;
        name="Anand";
    }
    void show(){
        System.out.println(age+" "+name);
    }
}


public class consturactor {
    public static void main(String[] args) {
        b obj=new b();
        obj.show();
    }
}
