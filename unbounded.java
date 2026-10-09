public class unbounded {
    public static void main(String[] args) {
        Scanner ref=new Scanner(System.in);

        int num;
        char option;

        do{
        System.out.println("enter your number:");
        num=ref.nextInt();

        System.out.println("you enter "+num);
        System.out.println("do you want to continue(y\n");
        option=ref.next().charAt(0);
        }while(num!=0);
        System.out.println("program end");

    }
}
