public class this_current_class_method {
    public static void main(String[] args) {
        
thisDemo d= new thisDemo();
d.display();

    }
}
//It is used to refer to the current class method.

class thisDemo{

void show(){

    System.out.println("hello from show () method");

}

void display(){
// calling another method of same class using "this"
    this.show();
    System.out.println("inside display method()");
}





}