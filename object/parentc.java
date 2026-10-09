

//parent class method in child class
public class parentc {
    public static void main(String[] args) {
        child ref = new child();   // Step 1: Create child object
        ref.show();                // Step 2: Call child’s show() method
    }
}

class parent {
    void display() {
        System.out.println("hello from parent class display() method");
    }
}

class child extends parent {
    void show() {
        super.display();   // Step 3: Call parent’s display() method
        System.out.println("inside the child class show() method");
    }
}


