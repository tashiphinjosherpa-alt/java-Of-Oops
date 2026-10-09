class Student {
    // Data members
    String name;
    int rollNo;
    int age;

    // Method to display student details
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Age: " + age);
    }
}

public class StudentDemo {
    public static void main(String[] args) {

        // Creating object of Student class
        Student s1 = new Student();

        // Assigning values
        s1.name = "John";
        s1.rollNo = 101;
        s1.age = 20;

        // Display details
        s1.display();
    }
}