import java.util.Scanner;

/**
 * LCM
 */
public class LCM {

    public static void main(String[] args) {
        

Scanner ref= new Scanner(System.in);

System.out.println(" enter one number:");
int num1= ref.nextInt();
System.out.println(" enter second number:");
int num2= ref.nextInt();

int lcm=num1;

if(num2>num1){
    lcm=num2;

    }
    while(true){
        if(lcm%num1==0 && lcm%num2==0){
            System.out.println("LCM of "+num1+" and "+num2+" is: "+lcm);
            break;
        }
        lcm++;
    }
    }
}