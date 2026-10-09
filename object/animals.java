public class animals {

    int age;
    String color;
    void initobj(String a, int b){
        color=a;
        age=b;
    }
     void Display(){
        System.out.println(color+" "+age);
    }
    
    public static void main(String[] args) {

        animals cow=new animals();
        cow.initobj("black",12);
        cow.Display();
        
    }
}
