package july;

public class return_example {
    public static void main(String[] args) {

// checkage(12);
checkage(29);




System.out.println("voting ended");


    }

    static void checkage(int age) {
        if (age < 18) {
            return;// exist the method
        }
        System.out.println("you can vote :"+age);

    }

}
