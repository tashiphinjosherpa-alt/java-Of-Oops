public class this_current_class_method1 {
    public static void main(String[] args) {
        
demo d= new demo();
d.look();


        // method lai method ma bolaune this use gareara ani tyo ne same class ma etc
    }
}
class demo{

void display(){

    System.out.println("k gardai chau mero bhai");
}
 int show(){
    this.display();
    System.out.println("thikaii xa mero dai ani tapai lai kasto xa? ");

    return 2;
 }

 void show1(){
    this.show();
    System.out.println(" khana khayo ta mero bhai?");
 }

 void look(){
    this.show1();
    System.out.println("k heareako merto bhai");
 }



















}
