public class this_current_class_constructor {
    public static void main(String[] args) {

        logo r= new logo("Tashi phinjo sherpa");
        
        
    }
}

class logo{

    logo(){
        System.out.println(" ajkla k gardai xau kta kti hou maile default constructor call garea hai");
    }

    logo(String name){

       this(); //  using default co structor using this

        System.out.println("hello mero bhai name, "+name);
    }
}