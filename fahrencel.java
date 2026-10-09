 // fahrenheit to celsius
 import java.util.Scanner;
 public class fahrencel {
    public static void main(String[] args) {
        float fahren;

        System.out.println("enter the temperature");
        Scanner ref=new Scanner(System.in);

        fahren=ref.nextFloat();
        fahren =((fahren - 32)*5)/9;

        System.out.println(fahren);

    }
}
