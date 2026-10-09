package july;

public class Reverse_NUm {
    public static void main(String[] args) {
        
        int number=123545;
         int reversedNumber=0;
         while(number!=0)
         {
            int remainder= number%10;
               reversedNumber= reversedNumber*10+remainder;
            number = number/10;
         }
         System.out.println("Reversed Number : "+reversedNumber);
    }
}
