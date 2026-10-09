package july;
//anonymous  innner class
public class anony {
    public static void main(String[] args) {
        hari ref=new hari(){
            void sita(){
        System.out.println("tashi is villian");
    }
        };
        ref.sita();
        
    }
}
class hari{

    void sita(){
        System.out.println("tashi is hero");
    }
}
