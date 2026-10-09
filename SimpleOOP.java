// Simple class
class Car {
    String brand;
    int year;

    // Method
    void showInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Year: " + year);
    }
}

// Main class
public class SimpleOOP {
    public static void main(String[] args) {
        // Create object
        Car c1 = new Car();
        c1.brand = "Toyota";
        c1.year = 2020;

        // Call method
        c1.showInfo();
    }
}
