public class Association_HAS {
    public static void main(String[] args) {
        Student ref1=new Student();
        ref1.displayInfo(); 
        
    }
}


class Address{

    String city = " Kathmandu";
    String country = " Nepal";

    void displayAddress(){
        System.out.println("City: "+city+",Country: "+country);
    }
}

class Student{

    String name="TAshi Phinjo Sherpa";
    int rollNum=809;

    Address ref= new Address();
    

    void displayInfo(){

        System.out.println("Name: "+name+",Rollnum:"+rollNum);
        ref.displayAddress();
    }
}