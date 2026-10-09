/**
 * BankAccountDemo
 */
public class BankAccountDemo {

    public static void main(String[] args) {
         Bank_Account b= new Bank_Account();
         b.payment();

    }
}
class Bank_Account{

    int account_Number;
    int Salary=16000;

    void payment(){
System.out.println("he have rs."+this.Salary);
System.out.println("He has account number "+this.account_Number);

    }
}