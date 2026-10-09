import java.util.Scanner;
public class ifelse2 {
    public static void main(String[] args) {
        Double  a;

        System.out.println("enter a number");
        Scanner ref = new Scanner(System.in);
         a = ref.nextDouble();
         if(a<0){
            System.out.println("number is negative");
         }else{
            System.out.println("not negative");
         }
    }
    
}
