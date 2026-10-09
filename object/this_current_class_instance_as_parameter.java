public class this_current_class_instance_as_parameter {
    public static void main(String[] args) {
        
demo obj = new demo();
obj.call();

    }
}
class demo{

    void display(demo obj){

System.out.println("display m,ehod called()");
    }

void call(){
//passing current object as a argument using this
display(this);

}



}
