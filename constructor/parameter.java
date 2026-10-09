package constructor;

public class parameter {
int age;
String name;
float marks;

parameter ( int age, String name, float marks){
    this.name=name;
    this.age=age;
    this.marks=marks;


}

    public static void main(String[] args) {
        parameter p1= new parameter(3, "tashi", 22.6f);
        parameter p2= new parameter(45, "hari",66);
        parameter p3= new parameter(29, "dinesh", 63);

        System.out.println(p1.name+" "+p1.age+ " "+p1.marks);
        System.out.println(p2.name+" "+p2.age+ " "+p2.marks);

        
    }
    
}
