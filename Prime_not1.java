import java.util.Scanner;

public class Prime_not1 {
    public static void main(String[] args) {
        
        Scanner  ref= new Scanner(System.in);

        System.out.println("Enter  the number: ");
        int num=ref.nextInt();

        if(num<=1)
        {
            System.out.println(num+" is not a prime number. ");
            return;
        }

        boolean isPrime=true;

        for(int i=2; i<num/2;i++)
        {
            if(num%i==0)
            {
                isPrime= false;
                break;
            }
        }
        if(isPrime)
        {
            System.out.println(num+" is a prime number");
        }
        else{
            System.out.println(num+" is not a prime number.");
        }
    }
}
