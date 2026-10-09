package july;

public class Continue_While_Loop {
    public static void main(String[] args) {
        
int number=1;
while(number<=5)
{

    if(number==3){

        System.out.println("Skipping number:"+number);
        number++;//increment the number to avoid  an infinite loop
        continue;
    }
    System.out.println("number: "+number);
    number++;
}

    }
}
