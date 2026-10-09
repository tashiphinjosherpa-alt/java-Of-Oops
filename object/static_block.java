public class static_block {
    public static void main(String[] args) {
       System.out.println("count :"+hero.count);
       System.out.println(" main method is excuted"); 


    }
}
class hero{

    static int count;
    static{

        count =345;
        System.out.println(" static block is executed.");
    }
}