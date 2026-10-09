import java.util.Scanner;
public class method2 {
//instance variable
int age;
String name;
static int age1;
int add,sub;

    void input(){
        Scanner ref= new Scanner(System.in);
        System.out.println("Enter any two number");
      age=  ref.nextInt();
      age1=  ref.nextInt();


    }

    void processing(){
        add=age+age1;
        sub = age -age1;



    }

    void output(){
        System.out.println(add+" " +sub);


    }

    public static void main(String[] args) {
        method2 m= new method2();
        m.input();
        m.processing();
        m.output();



    }
    
}
