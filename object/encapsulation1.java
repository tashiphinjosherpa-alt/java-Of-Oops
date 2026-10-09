public class encapsulation1 {
    public static void main(String[] args) {
        Bandu ref= new Bandu();
        ref.setValue(700);
        // ref.marks=300;
        // System.out.println(" the marks is " +ref.marks);
        System.out.println(" the value is "+ref.getValue());


    }
}
class Bandu{

   private int marks;

    public void setValue(int x ){
  marks=x;

    }

    public int getValue(){

return marks;
    }

}
