package july;


//Constructor Injection
// Passing the dependent object through the constructor
public class HAS_A1 {
    public static void main(String[] args) {
        
        engine e= new engine();

        car mycar = new car(e);
        mycar.startcar();
    }
}

class car{
private engine e;

car (engine e){

    this.e= e;
}
 
void startcar(){

    e.startEngine();
    System.out.println("car use engine");
}

}
class engine{

void startEngine(){
   System.out.println("Start Engine");

}

}
