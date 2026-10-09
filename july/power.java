package july;
import java.util.Scanner;
public class power {
    public static void main(String[] args) {
        int num,power,result=1;

        Scanner ref= new Scanner(System.in);
        System.out.println("enter number");
       num = ref.nextInt();

       System.out.println("enter power");
       power=ref.nextInt();

    for(int i=1;i<=power;i++){

        result=num*result;
    }
 System.out.println(result+" ");
    }
}
