class Mythread extends Thread{
    
    Mythread(String name){
        super(name);
    }

    public void run(){
        increment();
    }

    public void increment(){
        System.out.println("Increment() executing on thread: " + currentThread().getName());
    }
}
public class Main1 {

    public static void main(String[] args) {
        
        Mythread t1 = new Mythread("CustomThread1");
        t1.start();
        Mythread t2 = new Mythread("CustomThread2");
        t2.start();
        t1.increment();

    }
}
