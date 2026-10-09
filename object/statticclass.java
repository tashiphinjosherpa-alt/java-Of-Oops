public class statticclass {
    public static void main(String[] args) {
        
outer.inner obj= new outer.inner();
obj.show();
outer ref = new outer();
ref.display();

    }
}
class outer{

    void display(){
        System.out.println("hey i am outer class");
    }

    static class inner{

void show(){

    System.out.println("static nested class method");
}


    }
}
