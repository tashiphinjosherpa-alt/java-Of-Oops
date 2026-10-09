
public class localinner {
   private String a="tashi phinjo";
   String b="sherpa";
    void show(){
        class localin{
            void dd(){
                System.out.println("............................................");
                System.out.println("This hero name is "+a+ " "+b);
                System.out.println("..............................................");
            }
        }
        localin l= new localin();
        l.dd();
    }
    public static void main(String[] args) {
        localinner ref = new localinner();
        ref.show();
        
    }
}

