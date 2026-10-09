public class localinnerc {
   private int i=20;
   int b=67;
    void show(){
        class localinner{
            void dd(){
                System.out.println("addition of i and b is "+(i+b));
            }
        }
        localinner l= new localinner();
        l.dd();
    }
    public static void main(String[] args) {
        localinnerc ref = new localinnerc();
        ref.show();
        
    }
}
