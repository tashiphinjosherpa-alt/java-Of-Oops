import java.util.Scanner;
public class armstrong {
    public static void main(String[] args) {
        int num,arm=0,r,c;

        Scanner ref= new Scanner(System.in);
        System.out.println("enter any number");
        num = ref.nextInt();
      c=num;
        while(num>0){


            r=num%10;
            arm=(r*r*r)+arm;
            num=num/10;
        }
     if(c==arm){
        System.out.println("armstrong");
     } else{

        System.out.println("not armstrong");
     }

     }

    }

