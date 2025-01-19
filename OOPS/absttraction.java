abstract class animal {
    animal() {
        System.out.println("All animal......!");
    }

    public abstract void sound();

}

class Dog extends animal {
    Dog() {
        super();
    }

    public void sound() {
        System.out.println("Dog is barking");
    }
}

class Lion extends animal {
    Lion() {
        super();
    }

    public void sound() {
        System.out.println("Lion is roar");
    }
}

public class absttraction {
    public static void main(String[] args) {
        Dog d = new Dog();
        Lion l = new Lion();
        d.sound();
        l.sound();
    }
}
