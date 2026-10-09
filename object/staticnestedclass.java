

public class staticnestedclass {
    public static void main(String[] args) {
        A ref= new A();
        ref.show();
        A.B r= ref.new B();
        r.display();
        A.C re=new A.C();
        re.look();


    }
}

class A {
    int age;

    void show() {
        System.out.println("hey looks here here is void show");
    }

    class B {
        void display() {
            System.out.println(" resham pheri pjheri la haiii");
        }

    }
    static class C{
        void look(){
            System.out.println("naya nepal ahhyo ahhyo ganda ko ahhyo");
        }
    }
}
