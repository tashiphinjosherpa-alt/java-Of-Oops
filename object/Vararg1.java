public class Vararg1 {
    void show(int... num) {
        int sum = 0;
        for (int x : num) {
            sum = sum + x;
        }
        System.out.println("Sum of the numbers is " + sum);
    }

    void display(String... names) {
        System.out.print("Their names are: ");
        for (String n : names) {
            System.out.print(n + " ");
        }
        System.out.println(); // move to next line
    }



    int look(int...age){
   
        for(int k:age){ 

        System.out.println(" their age is "+k);
        }
        return 1;
    }
    public static void main(String[] args) {
        Vararg1 ref = new Vararg1();
        ref.show(2, 4, 6, 8);
        ref.show();
        ref.show(3, 4, 5, 9, 13);

        ref.display("tashi", "hari");
        ref.display("\nsandesh","\n pasang","\n sonam");

        ref.look(21,45,90);
    }
}
