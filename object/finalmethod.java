public class finalmethod {
    public static void main(String[] args) {
        child c= new child();
        c.show();


    }
}

class parent{

    final void show(){

        System.out.println("this is the final method from class");
    }

}
class child extends parent{
//subclass cannot override the method or to change the code


}