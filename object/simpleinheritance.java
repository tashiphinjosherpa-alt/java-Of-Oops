/**
 * simpleinheritance
 */
public class simpleinheritance {

    public static void main(String[] args) {
        Student ref= new Student();
        ref.input();
        Tashi r= new Tashi();
        r.display();
        

    }
}

class Student{// super class
int roll; String name;
int marks;
void input(){

    System.out.println(" Enter Name, MArks and Roll :");
}


}

class Tashi extends Student{// sub class

void display(){

String name="TASHi"; int roll=9;
int marks=99;
    System.out.println(name+" "+marks+" "+roll);
}

}