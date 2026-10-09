package july;

public class Superdem {
    public static void main(String[] args) {
        child c= new child();
        c.display();
        
    }
}

class parent{
int num= 120;

}
class child extends parent{

    int num=450;
    void display(){
        System.out.println("child num is "+num);
        System.out.println("parent num is "+super.num);
    }


}