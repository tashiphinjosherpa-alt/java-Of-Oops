public class countobject {
    public static void main(String[] args) {
        //static variable to keep count of object

Counter ref= new Counter();
Counter ref1 = new Counter();
Counter ref2= new Counter();
Counter ref3 = new Counter();
Counter ref4= new Counter();
Counter ref5 = new Counter();

    }
}

class Counter{
static int count=0;
Counter()
{
    count++;
    System.out.println("object created. count = "+count);
}

}
