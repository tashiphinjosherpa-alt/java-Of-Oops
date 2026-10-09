package july;
//Association is achieved by declaring object references as instance variables inside a class.

public class HAS_A {
    public static void main(String[] args) {
        Ball ref= new Ball();
        // ref.hello();
        ref.fifa();
    }
}
class Apple{

String name;
int roll;
int age;
float marks;
 
void cook(){
 System.out.println(" i like to cook food");


}



}

class Ball{

int phone;
String adress;
void hello(){

    System.out.println(" k gardaii xau sabao jana");
}
Apple r= new Apple();

void fifa(){
    r.cook();
}



}