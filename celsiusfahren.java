import java.util.Scanner;
public class celsiusfahren {
    public static void main(String[] args) {
        Double temp;
        Double newtemp;
        String unit;

        Scanner ref = new Scanner(System.in);

        System.out.println("enter any number");
       temp = ref.nextDouble();

       System.out.println("Conert to celsius or fahrenheit ? (c or f) :");
       unit=ref.next();

       System.out.println(temp);
       System.out.println(unit);
    }
}
