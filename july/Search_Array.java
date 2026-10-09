package july;

import java.util.Scanner;



public class Search_Array {
    public static void main(String[] args) {
        
int a[]= new int[5]; int count=0;
Scanner r = new Scanner(System.in);
for(int i=0;i<a.length;i++){
a[i]=r.nextInt();


}
System.out.println("array Element ");
for(int i=0;i<a.length;i++){
System.out.println(a[i]);


}

// searching
System.out.println("Enter Search Element ");
int n= r.nextInt();
for(int i=0;i<a.length;i++){
   
    
    if(a[i]==n){ 
    
         count++;
    }
    
}
    if(count>0){
        System.out.println("item found ");
    }else{
        System.out.println("item not found");
    }


    }
}
