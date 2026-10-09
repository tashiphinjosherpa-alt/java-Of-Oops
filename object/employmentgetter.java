public class employmentgetter {
   public static void main(String[] args) {
    employment ref= new employment(23, "tashi");
    employment ref1= new employment(67, "hari");
    employment ref3= new employment(77, "shyam");





   } 
}

class employment{
    private int id;
    private String name;

    private static String  workPlace="microsoft";

    employment(int id, String name){
        this.id=id;
        this.name=name;
    }

    }

