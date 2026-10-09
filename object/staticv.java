public class staticv {
    int a=12;
    static int b=38;

    static void Show(){

        System.out.println( b+"\n ");
    }

    void Display(){
        System.out.println(b+" "+a);
    }
    public static void main(String[] args) {

        staticv s=new staticv();
        s.Display();
        staticv.Show();
        
    }
}
