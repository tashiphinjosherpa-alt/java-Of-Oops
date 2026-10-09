public class method {
int age;
String colour;
    void initobj(String c,int a){
        colour=c;
        age=a;

    }

    void Display()
    {
       
     System.out.println(colour+" "+age);
    }
    public static void main(String[] args) {
        method m= new method();
        
        m.initobj("red",33);
        m.Display();
        


    }
}
