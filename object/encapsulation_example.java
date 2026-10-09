

public class encapsulation_example {
    public static void main(String[] args) {
        car c = new car();
        c.setDetail("tafa", 7700);
        c.printDetail();
    }
}

class car {
    String brand;
    int speed;

    void setDetail(String b, int s) {
        brand = b;
        speed = s;
    }

    void printDetail() {
        System.out.println("Brand    : " + brand);
        System.out.println("Speed    : " + speed);
    }
}

