import javaaa.calculator;

public class parametre{
    public static void main(String[] args) {
        
        Animal ref= new Animal();
        ref.eat("Donkey");
        ref.run("cat");



    }
}
class Animal{

void run(String name){

    System.out.println(name+" is running");
}

int eat(String name){

    System.out.println(name+" is eating ");

    return 1;
}


}
