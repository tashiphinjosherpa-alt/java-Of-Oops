
// member inner class


public class memberinner {
    public static void main(String[] args) {
        outer  obj= new outer();
        outer.inner in= obj.new inner();
        in.sum();
        
    }
}
class outer{
int a=20;
private int b=30;
static int c=50;

// member inner class

    class inner{
void sum(){
    System.out.println(" sum is "+(a+b+c));
}

    }
}
