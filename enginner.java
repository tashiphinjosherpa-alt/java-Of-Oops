import java.util.Scanner;
public class enginner {
    public static void main(String[] args) {
        Scanner ref = new Scanner(System.in);
        
        System.out.println("Enter your name");
        String name =ref.nextLine();

        System.out.println();

        System.out.println("enter your location");
        String location =ref.nextLine();

        System.out.println();

        System.out.println("enter your marks");
        float marks = ref.nextFloat();

        System.out.println();

        System.out.println("-------------------------------------");

        System.out.println("Display:\n Name : " +name+ "\n Location : "+location+ " \n Marks :" +marks);
    

    }
    
}
