package july;

class outer {
    String name = "outer variable";

    // void display() {
    //     System.out.println("Outer display: " + name);
    // }

    class inner {
        String name = "inner variable";

        void display() {
            System.out.println("Inner display: " + name);
            System.out.println("Access outer variable: " + outer.this.name);
        }
    }
}

public class anonymous1 {
    public static void main(String[] args) {
        outer ref = new outer();
        // ref.display(); // Calls outer's display()

        outer.inner r = ref.new inner();
        r.display();   // Calls inner's display()
    }
}
