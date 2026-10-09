package july;

public class anony3 {
    public static void main(String[] args) {
bird b= new bird(){
void fly() {
        System.out.println("i like the most beautiful bird that found in my locality is danfe");
    }


};


bird.reptile r= b.new reptile(){
    void sound() {

            System.out.println("my hatest reptile is crocodile");

        }
};
r.sound();
b.fly();
    }
}

class bird {
    void fly() {
        System.out.println("Each and every bird can fly sccept ostrich and emu");
    }

    class reptile {
        void sound() {

            System.out.println("All living thing can make sound like agh agh hik huu hu");

        }

    }
}