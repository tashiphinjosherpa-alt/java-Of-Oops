public class SumOF_digit {
    public static void main(String[] args) {
        

int num=345;
int sum=0;
while(num!=0){

    int digit= num%10;
    sum= sum+digit;
    num=num/10;
}

System.out.println(" the sum of the digit is :"+sum);

    }
}
