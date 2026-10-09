package july;

public class Palindrome {
    public static void main(String[] args) {
        
int num = 52325;
int originalNumber= num;
int reversedNumber= 0;

while(num!=0){

int remender = num%10;
reversedNumber = reversedNumber*10 +remender;
num = num/10;

}

if(originalNumber== reversedNumber)
{
    System.out.println(originalNumber +" is a palindrome number");
}else 
{

    System.out.println(originalNumber+"is not Palindrome number.");
}



    }
}
