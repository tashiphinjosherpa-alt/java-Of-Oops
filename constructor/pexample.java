package constructor;

public class pexample {
    int age;
    String name;
    float marks;

    public pexample(int age, String name,float marks){
        this.name=name;
        this.age=age;
        this.marks=marks;


    }
    public static void main(String[] args) {

        pexample p = new pexample(20,"hari",78.0f);
        pexample p2= new pexample(90,"pemba",65.0f);
        pexample p3= new pexample(56,"doma",23);



        System.out.println(p.name+" "+p.age+ " "+p.marks);
        System.out.println(p2.name+" "+p2.age+ " "+p2.marks);
        System.out.println(p.name+" "+p2.marks+ " "+p3.age+ " " +p.name+ " "+p2.age+ " " +p2.name+ " "+p3.marks+" "+p3.age);

        
    }
    
}
