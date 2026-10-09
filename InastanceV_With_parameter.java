public class InastanceV_With_parameter {
    public static void main(String[] args) {
        
Animal yak= new Animal();

yak.no_of_eyes=2;
yak.colors="black";
yak.detail("Yak");


    }
}
class Animal{
    int no_of_eyes;
String colors;

public void detail(String name){

    System.out.println("-------Details of " +name+ " ----------");
    System.out.println("eyes : "+no_of_eyes);
    System.out.println("color : "+colors);

}
}
