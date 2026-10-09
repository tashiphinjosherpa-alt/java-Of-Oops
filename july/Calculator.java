package july;

public class Calculator {
    public static void main(String[] args) {
        

        double num1=10, num2=60;

        char operator ='+';
        double result;

        switch (operator) {
            case '+':
                result= num1 + num2;
                System.out.println("Result: "+result);
                break;

                case '-' :
                    result= num1- num2;
                    System.out.println("Result: "+result);
                    break;

                    case '*' :
                        result = num1* num2;
                        System.out.println("Result: "+result);
                        break;
        
            default:
                System.out.println("Invalid operator. Please choose a valid operation.");
                break;
        }
    }
}
