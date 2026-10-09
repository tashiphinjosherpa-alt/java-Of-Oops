import java.util.Scanner;
public class perfectnumber {
    public static void main(String[] args) {
        int num,sum=0;

        System.out.println("enter any number");
        Scanner ref =new Scanner(System.in);
        num=ref.nextInt();

        for(int i=1;i<num;i++){
            if(num%i==0){
                sum = sum+i;

            }
        }
            if(sum ==num){
                System.out.println("number is perfect");
            }else{
                System.out.println("number is not perfect");
            }
        
    }
    
}
