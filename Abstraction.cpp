#include <iostream>
using namespace std;

class ATM {
private:
    int balance = 5000;

public:
    void withdraw(int amount) {
        if(amount <= balance) {
            balance -= amount;
            cout << "Withdraw Successful\n";
        }
        else {
            cout << "Insufficient Balance\n";
        }
    }

    void showBalance() {
        cout << "Balance: " << balance << endl;
    }
};

int main() {
    ATM user;

    user.showBalance();
    user.withdraw(1000);
    user.showBalance();

    return 0;
}