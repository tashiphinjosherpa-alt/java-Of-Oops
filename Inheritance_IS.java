public class Inheritance_IS {
    public static void main(String[] args) {
        
        car ref= new car();
        ref.drive();
        ref.start();



    }
}

class Vehicle{

    void start(){

        System.out.println("Vehicles starts..");
    }
}

class car extends Vehicle{

    void drive(){

        System.out.println(" Car drives:");

    }
}
