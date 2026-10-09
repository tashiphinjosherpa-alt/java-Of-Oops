public class reference1 {
    String name;
    String college="dwit";

    void show( reference1 ref){
        ref.name = ref.name + " Bahadur"+ " He is a good math teacher";


    }

    int display(reference1 ref){
        // ref.college



        return 1;
    }


    public static void main(String[] args) {
        reference1 ref= new reference1();
        ref.name="Hari Pokhrel";
        System.out.println(" Name is "+ref.name);
        System.out.println();
        ref.show(ref);
        System.out.println(" print that the : "+ref.name);

        System.out.println("-------------------------------------------------------------------------------");

        ref.college="saifal academy";
        System.out.println(" "+ref.college+" ");

        System.out.println();

        ref.display(ref);
        System.out.println(" "+ref.college);


        
    }
}
