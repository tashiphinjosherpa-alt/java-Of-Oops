package constructor;

public class pexample1 {

    String name;
    int age;
    float number;

    pexample1(String name,int age,float number){

        this.name=name;
        this.age=age;
        this.number =number;




    }
    public static void main(String[] args) {
        pexample1 p1 =new pexample1( "tashi",22,51);
        pexample1 p2= new pexample1("ghale",22,12);
        pexample1 p3 =new pexample1("haridei",444,01);

        System.out.println(p1.name+ " "+p1.age+ " "+p1.number);
        System.out.println(p1.number+" "+p1.age);

    }
    
}
