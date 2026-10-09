public class this_instance_vatriable1 {
    public static void main(String[] args) {

        Torma ref= new Torma(23, "tashi");
        ref.display();
        


    }
}

class Torma{

    int id;
    String name;

    Torma(int id, String name){

        this.id= id;  // 'this.id' refers to the instance variable
        this.name = name;     // 'name' on the right refers to the parameter
        
  
  }

int display(){
System.out.println("id    : "+id);
System.out.println("Name  : "+name);

    return 0;
}


}
