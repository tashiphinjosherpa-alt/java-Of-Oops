class Student {
    int roll;
    String name;
    int marks;
}

public class obj {
    public static void main(String[] args) {
        // creating an object
        Student s = new Student();

        // assigning values
        s.roll = 1;
        s.name = "Pemba";
        s.marks = 85;

        // printing values
        System.out.println("roll: " + s.roll);
        System.out.println("name: " + s.name);
        System.out.println("marks: " + s.marks);
    }
}
