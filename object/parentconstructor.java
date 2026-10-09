public class parentconstructor {
    //parent constructor called to child
    public static void main(String[] args) {
        
child ref= new child();


    }
}
class parent{


    parent(){
System.out.println("called parent constructor");

    }

}
class child extends parent{

    child(){
        super();
        System.out.println("called chi;d constructor");
    }
    


}