package july;

public class Return_Method {
    public static void main(String[] args) {
        
        System.out.println("Result :"+addNumbers(4,5));//calling method

    }

public static int addNumbers(int a, int b){

int sum = a + b;
 return sum;// retun the sum to caller

}
}