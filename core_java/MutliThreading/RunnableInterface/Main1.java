class Mytask implements Runnable{

    public void run(){
        threadInformation();
    }
    public void threadInformation(){
        System.out.println("Current thread: " + Thread.currentThread().getName());
    }
}
public class Main1 {

    public static void main(String[] args) {
        
        Mytask task = new Mytask();

        Thread t1 = new Thread(task,"CustomThread1");
        t1.start();

        Thread t2 = new Thread(task,"CustomeThread2");
        t2.start();

        task.threadInformation();
    }
}
