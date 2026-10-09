package july;

public class For_Each_Loop_Longest {
    public static void main(String[] args) {
        
        String [] words={"apple","banana","strawberry","pineapple"};
        String Lamo=" ";

        for(String word: words){ 

            if(word.length()>Lamo.length())
            {
                Lamo=word;
            }

        }
        System.out.println(" the longest word is : "+Lamo);
    }
}
