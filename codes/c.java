class c{
    public static void main(String[] args) {
        int a=8,b,c;
        a+=++a + a-- + --a;
        b=a++ * ++a;
        c=a++ + ++b;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}