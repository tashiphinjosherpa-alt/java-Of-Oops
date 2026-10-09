
package object;

class Student {
    int roll;
    String name;
    float mark;
}

public class object {
    public static void main(String[] args) {
        Student tashi = new Student();
        System.out.println(tashi);   // prints class@hashcode
    }
}
