import java.util.Scanner;
public class Students {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter your name?");
        String name=sc.nextLine();

        System.out.println();

        System.out.println("what is your roll number");
        int roll = sc.nextInt();

        System.out.println();
     
        System.out.println("what is your marks?");
        float marks =sc.nextFloat();
    }
    
}
