package july;

/**
 * method_overloading
 */
//compile time polymorphism
public class method_overloading {

    public static void main(String[] args) {


        calculator cal = new calculator();
        System.out.println("sum(int) : "+cal.add(50, 60));
        System.out.println("sum(double) :"+cal.add(4.5, 2.3));
    }
}
//same method name but different parametr return type and so on.
class calculator{


    int add(int a, int b){

        return a+b;
    }

double add(double a, double b){


    return a+b;
}



}