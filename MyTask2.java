public class MyTask2  implements Runnable{
    public void run(){
        System.out.println("Runnable thread is running....");
    }
    
}

public class Main{
    public static void main(String[] args) {
        MyTask2 task= new MyTask2();
        Thread t2= new Thread(task);
        t2.start();
    }

}
