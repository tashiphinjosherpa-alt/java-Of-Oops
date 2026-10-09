public class Association_Direct_Ref {
    public static void main(String[] args) {
        
Student ref1= new Student();
ref1.displayInfo();


    }
}

class Address{

String city ="KAthmandu";
String gahli = "Akashedhara Chowk";

void displayAddress(){

    System.out.println("City: "+city+", Chowk: "+gahli);
}
}

class Student{
    String name="Tashi Sherpa";
    String course= "BCA";

    Address ref= new Address();
    void displayInfo(){
        System.out.println("Name: "+name+", Course: "+course);
        ref.displayAddress();
    }
}