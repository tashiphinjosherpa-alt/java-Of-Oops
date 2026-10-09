import java.util.Scanner;

public class Digit_Counter1 {
    public static void main(String[] args) {

Scanner ref= new Scanner(System.in);

System.out.println("enter a number: ");
int num= ref.nextInt();
int count=0;

while(num!=0){

    num=num/10;
    count++;
}
System.out.println(" the number of digit is: "+count);
        
    }

}
