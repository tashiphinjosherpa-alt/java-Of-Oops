package arrayinjava;

import java.util.Arrays;

//array element using array class toString, toList,deepToString
public class arrayelement {

    public static void main(String[] args) {
        String a[]={"tasshi","dele","sherpa","education","phortse"};

        System.out.println(Arrays.toString (a)+": arrays. to string ");
        System.out.println(Arrays.asList (a)+" : arrays. asList ");

        int arr[][]={{12,34},{45,56},{12,78},{0,12}};
        System.out.println(" deepToString : "+Arrays.deepToString(arr));


    }
    
}
