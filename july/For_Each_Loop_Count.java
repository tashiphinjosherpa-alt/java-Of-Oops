package july;

public class For_Each_Loop_Count {
    public static void main(String[] args) {
        
String [] cities ={ "kathmandu","kolkata","mumbai","pokhara","kalangi"};

int count=0;

for(String city : cities){

    if(city.startsWith("k")){
        count++;
        System.out.println("City starting with k: "+city);

        System.out.println();
    }

}

     System.out.println("Total cities starting with k= "+count);
    }
}
