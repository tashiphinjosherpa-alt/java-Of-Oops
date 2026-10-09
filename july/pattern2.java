package july;

public class pattern2 {
    public static void main(String[] args) {
        int j=0;
        for(int i=0;i<=4;i++){
            for(j=4;j>=i;j--){


                System.out.print(" ");
            }
            for(int k=0;k<=i;k++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i=0;i<=4;i++){
            for(j=0;j<=i;j++){


                System.out.print(" ");
            }
            for(int k=4;k>=i;k--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
