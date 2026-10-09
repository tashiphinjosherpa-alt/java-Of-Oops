public class byvalue1 {

    int data;
    int Bit=8;

    int show(int data) {
        data = data * 2;// value does not go inside because local
        return 2;
    }

    int display(int data){
       this.data= data*data;


return 1;
    }

    void look(int Bit){
       this.Bit= Bit+3;

    }

    public static void main(String[] args) {
        byvalue1 ref = new byvalue1();
        ref.data = 200;
        System.out.println(" before value is " + ref.data);

        ref.show(900);
        System.out.println(" after value is " + ref.data);

        ref.display(50);
        System.out.println("--------- "+ref.data);

        ref.Bit=16;
        System.out.println("ref le deako value lai lincha mathi declare gare ko value banda "+ref.Bit);

ref.look(3);
System.out.println(",,,,,,,,, "+ref.Bit);



    }
}
