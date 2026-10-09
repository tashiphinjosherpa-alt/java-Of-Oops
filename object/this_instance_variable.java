public class this_instance_variable {
    public static void main(String[] args) {
        
        ThisDemo ref= new ThisDemo();
        ref.show(67);
    }
}
class ThisDemo{


int num=23;

void show(int num){

    System.out.println("1.num: "+num);
    System.out.println("2. num : "+this.num);

}

}
