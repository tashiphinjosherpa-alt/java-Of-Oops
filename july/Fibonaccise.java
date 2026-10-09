package july;

public class Fibonaccise {
    public static void main(String[] args) {

        int n=10;
        int num1=0, num2=1;

        System.out.println("Fibonnaci Series: " + num1 + ", " + num2);

        for (int i = 2; i < n; i++) {

            int sum = num1 + num2;
            System.out.println(", " + sum);

            num1 = num2;
            num2 = sum;
        }

    }
}
