import java.util.Scanner;
public class method1 {
    int n1,n2;
    int add, multi,sub,div,rem;
    public static void main(String[] args) {
        method1 m1= new method1();
        m1.Input();
        m1.Processing();
        m1.Output();
        
    }

    void Input(){

        Scanner ref= new Scanner(System.in);
        System.out.println("enter any two number : ");
        n1=ref.nextInt();
       n2= ref.nextInt();


    }

    void Processing(){
        add=n1+n2;
        multi=n2*n1;
        sub=n2-n1;
        div=n2/n1;
        rem=n2%n1;


    }

    void Output(){
        System.out.println(" the two number add : "+add);
        System.out.println(" the two number multi : "+multi);
        System.out.println(" the two number sub : "+sub);
        System.out.println(" the two number div : "+div);
     System.out.println(" the two number rem : "+rem);


    }
}
