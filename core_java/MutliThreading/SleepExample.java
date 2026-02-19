class Mytask implements Runnable{

    public void run(){

        for(int i=0;i<5;i++){

            System.out.println("Current Thread: " + Thread.currentThread().getName());
            System.out.println(i);

           try{
                Thread.sleep(500);
            }
            catch(InterruptedException e){
                System.out.println(e.getMessage());
            }
        }
    }
}
public class SleepExample {

    public static void main(String[] args) {

        Mytask task = new Mytask();
        Thread t1 = new Thread(task,"Custom1");
        Thread t2 = new Thread(task,"Custom2");

        //Three Thread executing concurrently. one without affecting the other. with proper resource sharing.
        t1.start();
        t2.start();
        //task.run();

    }
}
