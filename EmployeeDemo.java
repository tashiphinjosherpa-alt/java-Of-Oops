
class Employee {
    // Data members
    String name;
    int id;
    double salary;

    // Method to display employee details
    void display() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
        System.out.println("Salary: " + salary);
    }
}

public class EmployeeDemo {
    public static void main(String[] args) {

        // Creating object of Employee class
        Employee emp = new Employee();

        // Assigning values
        emp.name = "Alice";
        emp.id = 1001;
        emp.salary = 50000;

        // Display employee details
        emp.display();
    }
}