public class byvalue {
    int data;
    void change(int data ){
        data=data+10;// local so doest not affect the referencd.data
    }

       void show(int data ){
       this.data=data+10; //this.data refers to the instance variable

    }
    public static void main(String[] args) {
        byvalue ref= new byvalue();
        ref.data=200;
        System.out.println("before change is "+ref.data);

         ref.change(30);
         System.out.println("after change is "+ref.data);

         ref.show(30);
         System.out.println("after change is "+ref.data);
        


    }
    
}
