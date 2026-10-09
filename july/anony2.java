package july;

class animal{
    void sound(){
        System.out.println("animals make zound");
    }
}

public class anony2 {
    public static void main(String[] args) {
        // Anonymous inner class overriding the sound() method

        animal dog= new animal(){ 
            //override
        void sound(){
        System.out.println("dog barks bau bau bau tero bau");
        }
    };


      animal cat = new animal(){
        void sound(){
        System.out.println("cat: meow meow meow meow");
    }


      };

        dog.sound();
        cat.sound();
    }
}
