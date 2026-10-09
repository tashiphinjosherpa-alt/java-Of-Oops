public class length{

    ///variable length argument (megthod over loading)
    
    void show(String ...names){

        
        for (String name:names)
            System.out.println(" "+name);
       
    }

public static void main(String[] args) {
    length ref = new length();
    ref.show("tashi","nishan","phura");
}
}
