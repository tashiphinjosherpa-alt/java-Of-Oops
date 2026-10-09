public class encapsulation5 {
    public static void main(String[] args) {
hero ref= new hero();
ref.setname("tashi");
System.out.println("Name is "+ref.getname());

ref.setage(55);
System.out.println(" age is "+ref.getage());
        
    }
}
class hero{
private String name;
private int age;
private int marks;

public String getname(){

return name;
}

public String setname(String n){
    name=n;

    return name;
}
public int getage(){

    return age;
}
 public int setage(int x){
    age=x;

    return age;
 }

}