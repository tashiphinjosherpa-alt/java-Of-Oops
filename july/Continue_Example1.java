package july;

public class Continue_Example1 {
    public static void main(String[] args) {
        String [] words={"apple", "banana", "Avacado","arange","mango"};

        for(String word: words){
            if(word.startsWith("a")){
                continue;
            }
            System.out.println(word);
        }
    }
}
