package july;

// Dependency Example
// One class uses another class temporarily (USES-A relationship).
// Example: Kalu USES-A Alu.

public class USE_A {
    public static void main(String[] args) {
        // Create a Kalu object
        Kalu worker = new Kalu();
        worker.doWork();
    }
}

class Alu {
    void cow(String rokpu) {
        System.out.println("printing doccument" + rokpu);
    }
}

class Kalu {
    // Kalu depends on Alu temporarily inside a method
    void doWork() {
        Alu ref = new Alu(); // dependency created here via instance variable
        ref.cow("project report.pdf"); // using Alu’s method
        System.out.println("work done");
    }
}
