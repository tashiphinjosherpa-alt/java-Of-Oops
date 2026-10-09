package july;

import java.util.Scanner;

public class hcf1 {
    public static void main(String[] args) {
        

        Scanner ref= new Scanner(System.in);

        System.out.println("Enterbnum1: ");
        int num1 = ref.nextInt();

        System.out.println("Enter num2: ");
        int num2 = ref.nextInt();

        int gcd=1;

        for(int i=1; i<=num1 && i<=num2; i++)
        {
            if(num1%i==0 && num2%i==0)
            {
                gcd=i;
            }
        }
        System.out.println("GCD "+gcd);
    }
}
