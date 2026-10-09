package Auguest;

public class MyThreads extends Thread {

    public void run(){

        System.out.println("Thread is running....");
    }


    
}

class MAin{
    public static void main(String[] args) {
        MyThreads t1= new MyThreads();
        t1.start();
    }
}
