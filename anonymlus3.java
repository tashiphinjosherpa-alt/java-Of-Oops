//anonymous inner class

class A {
    void show() {
        System.out.println("show all in");
    }
}

public class anonymlus3 {
    public static void main(String[] args) {
        A ref = new A() {   // Anonymous inner class
            void show() {
                System.out.println("show new in");
            }
        };
        ref.show();
    }
}

