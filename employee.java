public class employee {
  public static void main(String[] args) {
    employ ref= new employ(23, "Tashi");
    ref.work();



  }  
}
class employ{
int id;
String name;

employ(int id, String name){
    this.id=id;
    this.name= name;
}

void work(){
    System.out.println("They can work");
}


}
