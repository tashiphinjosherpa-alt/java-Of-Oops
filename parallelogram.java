import java.util.Scanner;

public class parallelogram {
    public static void main(String[] args) {
        double b, h, area;


        System.out.println("enter two number of parallelogeram");
        Scanner ref = new Scanner(System.in);
        b = ref.nextInt();
        h = ref.nextInt();

        area = b*h;

        System.out.println(" area of parellogram =" + area);
         
    }
    
}
