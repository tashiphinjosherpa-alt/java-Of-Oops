public class MyThread3 extends Thread{
    
    public void run(){
        for (int i=1; i<=10;i++){
            System.out.println(" printing "+i);
        }


    }
}
class main{
     public static void main(String[] args) {
        
System.out.println("Application started");// job 1

MyThread3 t1= new MyThread3();//job 2   
t1.start();

for(int i=1; i<=10;i++){
    System.out.println("Printing document"+i);
}
System.out.println("Application finished");// job 3

   

    }
}
