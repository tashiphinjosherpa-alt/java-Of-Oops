package july;

public class Inheritanc1 {
    public static void main(String[] args) {
        Car mycar = new Car("tashi", 12.2, 4);
        mycar.honk();
        mycar.showDetail();
    }
}

class Vehicle {
    String brand;
    double speed;

    public Vehicle(String brand, double speed) {
        this.brand = brand;
        this.speed = speed;
    }

    public void honk() {
        System.out.println("Beep! Beep! This is a " + brand);
    }
}

class Car extends Vehicle {
    private int doors;

    public Car(String brand, double speed, int door) {
        super(brand, speed);
        this.doors = door;
    }

    // method overriding (replacing the parent's behaviour)
    @Override
    public void honk() {
        System.out.println("Vroom Vroom! The " + brand + " speeds at " + speed + " mph");
    }

    public void showDetail() {
        System.out.println("Brand: " + brand + " | Doors: " + doors);
    }
}
