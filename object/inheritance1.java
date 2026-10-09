public class inheritance1 {
    public static void main(String[] args) {
        palden ref= new palden(0, null, null);
        ref.eat();

        Tashi r = new Tashi(12,"tashi","solukhumbu");
        r.age=45;
        System.out.println("age is "+r.age);
        r.play();
        r.sleep();
        r.eat();
    }
}

class palden {
    int age;
    String name;
    String District;

    palden(int age, String name, String District) {
        this.name = name;
        this.age = age;
        this.District = District;

    }

    void eat() {

        System.out.println(" he like to eat an banana");
    }

    void laugh() {
        System.out.println("he like to laugh all day");
    }

}

class Tashi extends palden {


    Tashi(int age, String name, String District) {
        super(age, name, District);
    }

    void sleep() {
        System.out.println(" he like to sleep all the day");
    }

    void play() {
        System.out.println(" he like to play games"+age);
    }

     void walk(){
        System.out.println(name);
     }
    Tashi t =new Tashi(age, null, null);
    

     


