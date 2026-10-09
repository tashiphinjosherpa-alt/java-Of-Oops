import java.util.Scanner;
public class multidimensional {
    public static void main(String args[]){
    int ar[][] = new int[3][4]; int i,j;

    Scanner ref=new Scanner(System.in);
    System.out.println("enter a number :");

    for(i=0;i<ar.length;i++){
        for(j=0;j<ar[i].length;j++){
            ar[i][j]=ref.nextInt();


        }
    }
System.out.println("matrix");
for(i=0;i<ar.length;i++){
    for(j=0;j<ar[i]length;j++){
        System.out.println( ar[i][j]+" ");

    }
}
}
}
