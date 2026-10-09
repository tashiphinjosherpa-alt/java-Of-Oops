package july;

/**
 * method_overriding
 */

//method overriding or run time polymorphism
// when a child defines the same method as the parent class but with different behaviour
public class method_overriding {

    public static void main(String[] args) {

        Aanimal a= new dog();  // parent reference child object
        a.sound();             // called the overriding method
        Aanimal ref= new Aanimal();
        ref.sound();
        dog d= new dog();
        d.sound();
        
    }
}
class Aanimal{
    void sound(){

        System.out.println("ani mals makes a sound");
    }



}
class dog extends Aanimal{

    void sound(){//overriding parent method
        System.out.println("dog barks");
    }

}
