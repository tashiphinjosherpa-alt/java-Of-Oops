import java.util.Scanner;
public class checkeven {
    public static void main(String[] args) {
        int num,count=0;

        Scanner ref=new Scanner(System.in);
        System.out.println("enter any number ");
        num=ref.nextInt();

        for(int i=1;i<=10;i++)
        {
            if(num%2==0){
                count++;
            }
            if(count==0){
                System.out.println("prime number");
            }
            else
                System.out.println("not prime number");
            break;
        }


    }
}
