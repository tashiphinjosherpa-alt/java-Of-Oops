import java.util.Scanner;

public class ifelse1 {
    public static void main(String[] args) {
        int num;

        System.out.println("enter a number");
        Scanner ref = new Scanner(System.in);
        num = ref.nextInt();

        if(num%2==0){
            System.out.println("the number is even");
        }else{
            System.out.println("number is not even");


        }
    }
}
