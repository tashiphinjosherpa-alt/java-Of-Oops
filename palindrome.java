import java.util.Scanner;
public class palindrome {
    public static void main(String[] args) {
        int num,c,r,sum=0;

        Scanner ref = new Scanner(System.in);
        System.out.println("enter number");
        num=ref.nextInt();

        c=num;
        while(num>0){
            r=num%10;
            sum = (sum*10)+r;
            num=num/10;

        }
        if(c==sum){
            System.out.println("palindrome is ");
        }else{
            System.out.println("not palindrome");
        }
    }
}
