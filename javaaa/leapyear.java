package javaaa;

public class leapyear {
    public static void main(String[] args) {
        int year=2026;
    
    if((year%400==0)||(year%4==0&&year%100!=0)){

        System.out.println("leapyear");
    }else{
        System.out.println("not leap yesr");
    }
    }

}
