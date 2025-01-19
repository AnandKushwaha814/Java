class a{
    int age;
    String name;
    a(){
        age=19;
        name="Anand";
        System.out.println(age+" "+name);
    }
    a(a ref){
        age=ref.age;
        name=ref.name;
        System.out.println(age+" "+name);
    }
}
public class copy {
    public static void main(String[] args) {
        a obj=new a();
        a obj2=new a(obj);
    }
}
