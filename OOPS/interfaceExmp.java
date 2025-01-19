import java.util.*;
interface client
{
    void input();   // public+abstrct
    void output();  // public+abstract
}
class anand implements client{
    String name;double sal;
    public void input(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter cient name: ");
        name=sc.nextLine();
        System.out.println("Enter client salary: ");
        sal=sc.nextDouble();
    }
    public void output(){
        System.out.println(name+" "+sal);
    }
}

public class interfaceExmp {
    public static void main(String[] args) {
        client c=new anand();
        c.input();
        c.output(); 
    }
}
