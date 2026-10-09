public class finalclass {
    public static void main(String[] args) {
       Apple ref= new Apple();
       ref.show(); 


    }
    
}
//A final class cannot be extended (i.e., no class can inherit it).
//This is useful for security and immutability (like the String class)
final class Apple{

    void show(){

        System.out.println(" this is my class apple");
    }
}
