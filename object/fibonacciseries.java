import java.util.Scanner;
public class fibonacciseries {
    public static void main(String[] args) {
        
        int term, a=0, b=1,c;
        System.out.println("Enter the Terms: ");
        Scanner ref= new Scanner(System.in);
        term=ref.nextInt();

        System.out.println();

        for (int i=1;i<=term;i++){

            System.out.print(" "+a);
            c=a+b;
            a=b;
            b=c;


        }
    }
}
