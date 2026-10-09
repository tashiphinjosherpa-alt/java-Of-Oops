public class static_variable {
    public static void main(String[] args) {

        Student ref = new Student("TAshi Phinjo Sherpa", 120);
        ref.displayDetail();
        Student ref1 = new Student("Phura Tenzing sherpa", 90);
        ref1.displayDetail();
        Student ref2 = new Student("Nima Chewang Sherpa", 98);
        ref2.displayDetail();
        Student ref3 = new Student("HAri BAhadur THapa", 70);
        ref3.displayDetail();

    }
}

class Student {

    String name;
    int rollNo;
    static String Schoolname = "Dwit";

    Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;

    }

    void displayDetail() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(" student name is        :  " + name);
        System.out.println(" student rollnumber is  :  " + rollNo);
        System.out.println("student college is      :  " + Schoolname);
        System.out.println("----------------------------------------------------------------------------");

    }

}
