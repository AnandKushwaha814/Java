class Student{
    int roll; String name;
    int marks;
    void show(){
        System.out.println("Enter roll name & marks: ");
    }
}
class simpleInheritance extends Student
{
    void disp(){
        roll=1;name="Anand";
        marks=99;
        System.out.println(roll+" "+name+" "+marks);
    }
    public static void main(String[] args) {
        simpleInheritance r=new simpleInheritance();
        r.show();
        r.disp();
    }
}
