import java.util.Scanner;
public class pilot {
    public static void main(String[] args) {
        Scanner p=new Scanner(System.in);

        System.out.println("enter your name");
        String name=p.nextLine();

        System.out.println();

        System.out.println("enter your address");
        String address=p.nextLine();

        System.out.println();

        System.out.println("enter your id");
        int id=p.nextInt();

        System.out.println();

        System.out.println("enter your gpa");
        float gpa=p.nextFloat();



        System.out.println("display:\n name is "+name+ "\n address is " +address+ "\n gpa is " +gpa);
    }


}
