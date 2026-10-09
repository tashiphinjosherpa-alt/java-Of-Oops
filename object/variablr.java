

/**
 * variablr
 */
public class variablr {

    public static void main(String[] args) {

        Apple ref= new Apple();
        ref.m1();
        ref.m2();

        Apple.m3();// ststic method can be directley call
        
    }
}

class Apple{
int num=19;// instance variable i.e belong to object
static int snum=45;

void m1(){
int num1=75;
    System.out.println(" Result 1: "+(num1 +num));
    System.out.println("result 2 :"+(num1+snum));
}

void m2(){
    int num2=56;//local variable

    System.out.println("result 4 :"+(num2+num));
    System.out.println("result 5 :"+(num2+snum));

    
}

 static void m3(){

    int num3=90;//local variable
    // System.out.println("result 6 :"+(num +num3));// cannot be use becuase num or instance variable cannot be use in static method
    System.out.println("result 7 :"+(num3+snum));
    // System.out.println("result 4 :"+(num2+num1+num2));  // because local variable



}


}