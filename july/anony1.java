package july;

public class anony1 {
    public static void main(String[] args) {
        parent t=new parent();
        parent.Test k= t.new Test();
        t.display();
        k.ref.display();

    }
}

class parent {
    void display() {
        System.out.println("k cha hou kta kti haru");
    }

    class Test {
        parent ref= new parent(){
        void display(){
        System.out.println("sabai jana sanchaii xau kta kti haru");
    }
            
        };
    }
}
