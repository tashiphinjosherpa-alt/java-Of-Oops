import java.util.Scanner;
public class cperimeter {
    public static void main(String[] args) {
       final double pi=3.14, perimeter;
       int r;
        System.out.println("enter the radius of circle");
        Scanner ref=new Scanner(System.in);
        r=ref.nextInt();

        perimeter=2*pi*r;

        System.out.println("perimetr of circle " + perimeter);

    }
    
}
