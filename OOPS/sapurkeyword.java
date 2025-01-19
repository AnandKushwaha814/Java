class a{
    ///a()      constructor
    //void show()
    int a=10;
}
class b extends a{
    int a=20;
    void show()
    //super.show()      method
    {
        System.out.println(a);
        System.out.println(super.a);
    }
}
class sapurkeyword{
    public static void main(String[] args) {
        b r =new b();
        r.show();
    }
}