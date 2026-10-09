
import java.util.Scanner;
  public class sarea{
    public static void main(String[] args){
        
         double length, area;


        System.out.println(" enter the length of square");
        Scanner ref = new Scanner(System.in);
        length = ref.nextDouble();

        area = length*length;

        System.out.println("the area of square = " + area);


    }
    
}
