public class encapsulation4 {
    public static void main(String[] args) {
        employment ref= new employment("tashi",  45,  44);
        System.out.println(" His name is "+ref.getName());
        ref.setName("hari bahadur");
        ref.setRoll(01);
        ref.setMark(99);
        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println(" Name : "+ref.getName()+ "\n Roll : "+ref.getRoll());
        System.out.println("-------------------------------------------------------------------------------------");

    }
}
class employment{

private String name;
private int roll;
private int mark;


employment(String name, int roll, int mark){
    this.name= name;
    this.roll=roll;
    this.mark= mark;

}
  
public String getName(){


    return name;
}

public int getRoll(){

    return roll;
}

// public void getMark(){


// }
public int getMark(){

    return mark;
}

public String setName(String name){
    this.name=name;
    return name;
}

public int setRoll(int roll){
    this.roll=roll;

    return roll;
}

public int setMark(int mark){
    this.mark=mark;

    return mark;
}
}