
class Calculator {

    int add(int a, int b, int c) {
        return a + b + c;
    }

    int add(int c, int d, int a, int b) {
        return c + d + a + b;
    }

    int add(int a, int b) {
        return a + b;
    }
}

public class MethodOverloading {
    public static void main(String[] args) {
        Calculator ref = new Calculator();

        int r1 = ref.add(12, 23, 78, 56); // calls 4-parameter version
        // int r2 = ref.add(10, 20, 30);     // calls 3-parameter version
        // int r3 = ref.add(5, 15);          // calls 2-parameter version

        System.out.println("Result of 4 params: " + r1);
        // System.out.println("Result of 3 params: " + r2);
        // System.out.println("Result of 2 params: " + r3);
    }
}
