// superclass
abstract class any {
    private String name;

    public any(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void makeSound();
}

// Subclass
class any1 extends any {
    public any1(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " barks");
    }
}

// Subclass inheriting from Superclass
class any2 extends any {
    public any2(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " meows");
    }
}

public class InheritanceExample {
    public static void main(String[] args) {
        any1 any1 = new any1("Buddy");
        any1.makeSound(); 

        any2 any2 = new any2("Whiskers");
        any2.makeSound();  
    }
}