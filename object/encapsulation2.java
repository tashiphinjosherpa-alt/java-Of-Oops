public class encapsulation2 {
    public static void main(String[] args) {

        apple ref = new apple();
        ref.setValue("nima dai");
        System.out.println("name is " +ref.getValue());
    }
}

class apple{

    private String name ="tashi";

public void setValue( String x){
    name=x;

    
}

public String getValue(){


    return name;
}

}
