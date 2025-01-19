class A {
    int a;
    String name;

    private A() {
        a = 20;
        name = "Anand";
        System.out.println(a + " " + name);

    }

    public static void main(String[] args) {
        A obj = new A();
    }

}
// class b{
// public static void main(String[] args){
// A obj=new A();
// }
// }
