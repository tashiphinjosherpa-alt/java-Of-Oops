public class encapsulation3 {
    //encapsulation i.e  declare class variable private and declare class method as a public.
    public static void main(String[] args) {
        ball ref = new ball();
        // ref.name="gorey";
        System.out.println(ref.getage()+" and "+ref.getname());
       System.out.println(ball.marks);
        
    }
}
class ball{
  private int age= 30;
 private String name="tashi";
 static int marks=67;

public int getage(){

    return age;
}
public String getname(){


return name;
}




}
