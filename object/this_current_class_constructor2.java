public class this_current_class_constructor2 {
    public static void main(String[] args) {

        Apple ref= new Apple();
        ref.show();

System.out.println();

        Apple ref1= new Apple(12);
        ref1.show();
        
System.out.println();

        Apple ref2= new Apple(44, "hari bahadur");
        ref2.show();



    }
}

class Apple {

    int age;
    String name;

    Apple(int a, String n) {
        age=a;
        name=n;

        System.out.println(" i am parametrized constructor ");

    }
    Apple(){
        this(23, "tashi");
        System.out.println("  i am default constructor ");
    }

    
    Apple(int a){
        this(a, "hari");
        System.out.println(" i am another parametrized constructor ");


    }
    void show(){

        System.out.println(" age "+age+ " name "+name);
    }

}
