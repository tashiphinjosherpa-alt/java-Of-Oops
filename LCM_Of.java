public class LCM_Of {
    
    public static void main(String[] args) {
        int a=177,b=115;
        int lcm=a;

        if(b>a){
            lcm=b;
        }

        while(true){
            if(lcm%a==0 && lcm%b==0){
                System.out.println("LCM of "+a+" and "+b+" is: "+lcm);
                break;
            }
            ++lcm;
        }
    }
}
