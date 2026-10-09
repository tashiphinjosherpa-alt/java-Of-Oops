
import java.util.Scanner;
public class refactorial {


    public static void main(String[] args) {
        int num;
        System.out.println("Enter a number");
        Scanner ref = new Scanner(System.in);
       num= ref.nextInt();
        refactorial r =new refactorial();
        int apple=r.fact(num);
        System.out.println(apple);

        
    }

int fact(int num){

    if(num==1)
        return 1;
    else
        return num * fact(num-1);
    

}

}
