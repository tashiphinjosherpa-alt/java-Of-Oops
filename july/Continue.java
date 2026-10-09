package july;

public class Continue {
    public static void main(String[] args) {
        
        for(int i=1; i<=5;i++){
            if(i==4){
                System.out.println("Skipping number :"+i);
                continue;
            }
            System.out.println("Numbers : "+i);
        }

        System.out.println("the end");
    }
}
