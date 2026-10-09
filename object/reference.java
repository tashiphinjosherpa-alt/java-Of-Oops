public class reference {
int data=45;//value is just for local or show
int age;
    void change(reference ref){
ref.data= ref.data+10;// change will be in instance
ref.age=ref.age-2;

    }


    public static void main(String[] args) {
        reference ref= new reference();
        ref.data=200;//reference local variable
        System.out.println("the value before change is "+ref.data);
        ref.change(ref);// passing the  object
        System.out.println("the value change after is "+ref.data);

        System.out.println();

        ref.age=34;
        System.out.println(" "+ref.age);

        ref.change(ref);
        System.out.println(" "+ref.age);

    }
}
