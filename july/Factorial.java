
package july;

/**
 */
public class Factorial {

    public static void main(String[] args) {
        
int number=5;

if(number<0){

    System.out.println("Factprial is not defined for negative number.");

} else {
long fact =1;

for(int i=1;i<=number;i++){

    fact= fact*i;


}
 System.out.println("Factorial of " +number+ " is: "+fact);

}

    }
}