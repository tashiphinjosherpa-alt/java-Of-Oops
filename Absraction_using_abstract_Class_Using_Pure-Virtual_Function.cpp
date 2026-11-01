#include <iostream>
using namespace std;

class Animal {
public:
    virtual void sound() = 0;
};

class Dog : public Animal {
public:
    void sound() {
        cout << "Bark" << endl;
    }
};

class Cat : public Animal {
public:
    void sound() {
        cout << "Meow" << endl;
    }
};

int main() {
    Dog d;
    Cat c;

    d.sound();
    c.sound();

    return 0;
}