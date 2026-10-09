public class Encapsulatio {
    public static void main(String[] args) {
        Capsule ref = new Capsule();
        ref.setValue(200);

        System.out.println("the value is  "+ref.getValue()); // prints 200
    }
}

class Capsule {
    private int age = 23; // data hiding

    public void setValue(int x) { // abstraction
        age = x;
    }

    public int getValue() {
        return age;
    }
}
