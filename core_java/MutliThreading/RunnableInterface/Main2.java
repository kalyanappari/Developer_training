//Using the runnable interface with the Anonymous classes and the lambda expressoins.
public class Main2 {

    public static void main(String[] args) {
        
        Runnable r =  new Runnable(){

            public void run(){
                System.out.println("Current thread is: " + Thread.currentThread().getName());
            }
        };

        Thread t = new Thread(r,"custom1");
        t.start();
        Thread t1 = new Thread(r,"custom2");
        t1.start();

        //Using the Lambda Expressions.

        Runnable r1 = () -> System.out.println("Current Thread :" + Thread.currentThread().getName());

        Thread t3 = new Thread(r1);
        Thread t4 = new Thread(r1);

        t3.start();
        t4.start();
    }
}
