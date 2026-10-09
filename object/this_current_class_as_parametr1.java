public class this_current_class_as_parametr1 {
    public static void main(String[] args) {
       demo obj= new demo();
       obj.show();
        

    }
}

class demo{

void display(demo obj){

    System.out.println(" hello i am  display () method called");


}

void show(){

    display(this);

        System.out.println(" i am show method whic is use to show");
    
}

}
