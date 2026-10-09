// Main class
public class InheritanceDemo {
    public static void main(String[] args) {
        // Create Dog object
        Dog myDog = new Dog("Simba", "Male", 3);

        // Call methods
        myDog.sound();       // Child class method
        myDog.run();         // Inherited method
        myDog.eating();      // Overridden method
        myDog.showInfo();    // Child class method
    }
}

// Parent class
class Animal {
    String name;
    String gender;
    int age;

    // Constructor
    Animal(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    void run() {
        System.out.println("I like to run in the jungle.");
    }

    void eating() {
        System.out.println("I am an omnivorous animal.");
    }
}

// Child class
class Dog extends Animal {
    int legs = 4;

    // Constructor calls parent constructor
    Dog(String name, String gender, int age) {
        super(name, gender, age);
    }

    // Child-specific method
    void sound() {
        System.out.println("It sounds like: Woof Woof!");
    }

    // Overriding parent method
    @Override
    void eating() {
        System.out.println("I am a carnivorous animal (dog).");
    }

    void showInfo() {
        System.out.println("Name: " + name + ", Gender: " + gender + ", Age: " + age + ", Legs: " + legs);
    }
}
