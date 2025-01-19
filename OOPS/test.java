class classobj {
    int a = 20;
    int c = 30;

    void show() {
        System.out.print(a + c);
    }
}

public class test {
    public static void main(String[] args) {
        classobj r = new classobj();
        r.show();
    }
}