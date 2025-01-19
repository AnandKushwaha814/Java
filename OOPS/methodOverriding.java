class shape {
    void show() {
        System.out.println("Dont say shape type");
    }
}

class squre extends shape {
    @Override
    void show() {
        System.out.println("Squere shape");
    }
}

public class methodOverriding {
    public static void main(String[] args) {

        shape r = new squre();
        r.show();
    }
}
