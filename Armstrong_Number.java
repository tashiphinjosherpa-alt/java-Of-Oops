public class Armstrong_Number {
    public static void main(String[] args) {
        int num = 153;
        int originalNum = num;
        int sum = 0;

        int temp = num;
        int digit = 0;

        // Count digits
        while (temp != 0) {
            digit++;
            temp = temp / 10;
        }

        temp = num; // reset temp for calculation

        // Calculate sum of powers
        while (temp != 0) {
            int rem = temp % 10;
            int mul = 1;

            for (int i = 0; i < digit; i++) {
                mul = mul * rem;
            }
            sum = sum + mul;
            temp = temp / 10;
        }

        if (sum == originalNum) {
            System.out.println("Yes, Armstrong Number: " + originalNum);
        } else {
            System.out.println("Not an Armstrong Number");
        }
    }
}
