//superclass
abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void makeSound();
}

// Subclass from Animal
class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " barks");
    }
}

// Subclass from Animal
class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " meows");
    }
}

public class poly {
    public static void main(String[] args) {
        Animal dog = new Dog("Buddy");
        Animal cat = new Cat("Whiskers");

        // Polymorphic behavior
        animalMakesSound(dog);  
        animalMakesSound(cat);  
    }

    public static void animalMakesSound(Animal animal) {
        // Polymorphism in action
        animal.makeSound();
    }
}