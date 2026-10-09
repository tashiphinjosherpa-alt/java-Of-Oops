package july;

public class USES_A {
    public static void main(String[] args) {
        Dog r = new Dog();
        r.sleep();
        
    }
}

class Animal {
    void eat(String name) {
        System.out.println("Displaying the: " + name);
    }
}

class Dog {
    void sleep() {
        // Dependency created here
        Animal ref = new Animal();
        
        
        ref.eat("name of my sister is");
        System.out.println("already done");
    }
}
