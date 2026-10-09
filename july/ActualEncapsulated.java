package july;

public class ActualEncapsulated {
    public static void main(String[] args) {
        Car ref = new Car();
        ref.setBrand("Tafa");   // set brand
        ref.setSpeed(7700);     // set speed
        ref.printDetail();      // print details
    }
}

class Car {
    private String brand;
    private int speed;

    // Setter for brand
    public void setBrand(String brand) {
        this.brand = brand;
    }

    // Getter for brand
    public String getBrand() {
        return brand;
    }

    // Setter for speed with validation
    public void setSpeed(int speed) {
        if (speed >= 0) {
            this.speed = speed;
        }
    }

    // Getter for speed
    public int getSpeed() {
        return speed;
    }

    // Method to print details
    public void printDetail() {
        System.out.println("Brand : " + brand);
        System.out.println("Speed : " + speed);
    }
}
