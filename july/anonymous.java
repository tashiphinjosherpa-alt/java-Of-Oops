package july;

/**
 * anonymous class
 */
class A {
    void show(){
        System.out.println("show A in");
    }

    // int cow(int a) {
    //     System.out.println(" cow is domestic animals.");
    //     return a;
    // }

    // int dog(int a, int b){
        
    //     return(a+b);
    // }

    class C extends A {
         void show(){
        System.out.println("show B in");
    }

    
        

        // void appple() {
        //     System.out.println("my name is tashi phinjo sherpa");
        // }

    }
}

public class anonymous {
    public static void main(String[] args) {
        A ref = new A ();
        ref.show();
    //     ref.cow(2);
    //    int result= ref.dog(2,3);
    //     System.out.println(result);
    //     A.B bo=ref.new B();
    //     bo.appple();
    A.C r= ref.new C();
    r.show();
    }

}