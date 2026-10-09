import java.util.Scanner;
public class voteeligible {
    int age;
    public static void main(String[] args) {
        Scanner r= new Scanner(System.in);

        System.out.println("enter any number ");
        age=r.nextInt();


        if(age >=18){
            System.out.println("you are eligible to vote");

        }else{
            System.out.println("you are not eligible to vote");
        }
    }
    
}
