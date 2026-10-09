//234
import java.util.Scanner;
public class sumofdigit {
    public static void main(String[] args) {
        int num, r,sum=0;

        System.out.println("enter any number");
        Scanner ref = new Scanner(System.in);
        num=ref.nextInt();

        while(num>0){

        r=num%10;
        sum=sum+r;
        num = num/10;


        }
        
        System.out.println(" " +sum);
        

    }
}
