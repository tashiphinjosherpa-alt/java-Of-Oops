import java.util.Scanner;

public class SUm_OF_Digit {
    public static void main(String[] args) {
        
Scanner ref= new Scanner(System.in);

System.out.println(" Enter a number: ");
int num= ref.nextInt();

int sum =0;

while(num!=0){
    int digit= num%10;
    sum = sum+digit;
    num= num/10;

}
System.out.println("the sum of the digit is : "+sum);



    }
}
