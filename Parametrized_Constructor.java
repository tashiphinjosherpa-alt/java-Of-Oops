public class Parametrized_Constructor {
    String name;
    int rollNum;
    Parametrized_Constructor(String n, int y){

        name= n;
        rollNum=y;
    }

    void display(){
        System.out.println("NAme: "+name+ ", Roll num: "+rollNum);
    }
    public static void main(String[] args) {
        Parametrized_Constructor er= new Parametrized_Constructor("TAshi Sherpa", 89);
       
        er.display();

    }
}
