public class constructor {

    String name;

    constructor(){
        name="Tashi sherpa";
    }

    void display(){
        System.out.println("Student name: "+name);
    }
    public static void main(String[] args) {
        constructor ref= new constructor();
        ref.display();
        

    }
}
