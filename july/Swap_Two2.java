package july;

public class Swap_Two2 {
    public static void main(String[] args) {

        int num1=66, num2=90;
        System.out.println("Before swaping : num1 = " + num1 + ",num2 = " + num2);

        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;

        System.out.println("After swapping : num1 =" + num1 + ", num2 = " + num2);
    }
}
