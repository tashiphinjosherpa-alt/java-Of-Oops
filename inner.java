
/**
 * inner
 */
class A {
    int num;

    void sum() {

        System.out.println("hello every one my name is tashi sherpa. i am from grade 13 in computer science");

    }

    int show() {

        System.out.println("rato makai dharama dharam, makaye bari karam karam");
        return 2;
    }

     static class B {

        void hello() {
            System.out.println(" aja class baeana hai math ko chuti ho");
        }

    }
}

public class inner {

    public static void main(String[] args) {
        A ref = new A();
        System.out.println();
        ref.sum();
        System.out.println();
        A.B r = new A.B();
        r.hello();
        System.out.println();
        ref.show();

    }
}
