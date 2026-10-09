public class bird {
String blood;
int height;
    void initobj(String a ,int b){
        height=b;
        blood=a;

    }
    void display(){

        System.out.println(blood+" "+height);
    }
    public static void main(String[] args) {
        bird danfe=new bird();
        danfe.initobj(" o positive ", 12);
        danfe.display();


            
        
    }
}
