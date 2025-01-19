interface a {
    void show();
}

interface b {
    void show();
}

class multipel implements a, b {
    public void show() {
        System.out.println("Interface a & b");
    }

public class multipleInterface {
    public static void main(String[] args) {
        
    
    multipel m=new multipel();
    m.show();
}
}
}
