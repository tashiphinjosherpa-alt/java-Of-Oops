import java.util.Scanner;
public class sqrt {
    public static void main(String[] args) {
        int num;
        Scanner ref=new Scanner(System.in);
        System.out.println("enter a number");
        num=ref.nextInt();


      double m=Math.sqrt(num);
       System.out.println("root square of "+num+" is "+m);
    }
}
