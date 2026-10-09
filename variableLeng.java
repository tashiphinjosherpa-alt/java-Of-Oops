public class variableLeng{
    //variable length argument
    
    int add(int ...nums){

        int total =0;
        for (int num:nums){
            total=total+num;
            System.out.println(num);
        }
        return total;
    }

public static void main(String[] args) {
    variableLeng ref = new variableLeng();
    ref.add(2,3,2);
}
}
