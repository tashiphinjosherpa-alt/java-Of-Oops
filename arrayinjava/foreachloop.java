package arrayinjava;

public class foreachloop {
    public static void main(String[] args) {
        int a[] = new int[4];
        a[0]=23;
        a[1]=34;
        a[2]=33;
        a[3]=56;

        for(int b : a){
            System.out.println(b+" ");
        }
    }
    
}
