 import java.util.Scanner;
 public class ifelsearray {
    public static void main(String[] args) {
        int num,i;


        System.out.println("enter any number");
        Scanner ref = new Scanner(System.in);
       num = ref.nextInt();
       int a[] = new int[num];

       for( i= 0; i<10; i++){
        a[i] = ref.nextInt();
       }
System.out.println("enter array element");


for(i= 0; i<10; i++){
    System.out.println(a[i] + " ");

}
    }
    
}

