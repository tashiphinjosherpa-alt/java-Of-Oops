public class itself {

    //recursion function

    int sum(int b){

        if(b>0){
            return b + sum(b-1);//calling
        }else{
            return 0;
        }
    }
    public static void main(String[] args) {
        int a;
        itself ref=new itself();
       a= ref.sum(7);//calling
        System.out.println(a);
    }
}
