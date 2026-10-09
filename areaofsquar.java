 import java.util.Scanner;
 public class areaofsquar {
    public static void main(String[] args) {
        
         double length, area;

        System.out.println(" enter the length of square");
        Scanner ref= new Scanner(System.in);
        length=ref.nextInt();

        area=length*length;

        System.out.println("the area of square is " + area);


    }
    
}
