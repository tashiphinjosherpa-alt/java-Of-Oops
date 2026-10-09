package MyThreads;

public class MyThreads extends Thread {
    public void run(){
        System.out.println("Thread is Loading.....");

    }
    
}
public class  Main{ 
    public static void main(String[] args) {
        MyThreads t1= new MyThreads();
        t1.start();
    }

}
