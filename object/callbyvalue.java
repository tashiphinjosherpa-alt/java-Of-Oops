public class callbyvalue {
    static void show(int data){
        System.out.println("data : "+data);
    }

    int display( int num){
        num= num+2;

        System.out.println(num);

    return 2;
}
    public static void main(String[] args) {
        show(88);// call by cvalue
        

        callbyvalue ref= new callbyvalue();
        ref.display(34);
        
        
    }
}
