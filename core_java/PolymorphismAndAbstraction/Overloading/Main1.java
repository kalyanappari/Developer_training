class A1{
    
    private void mes(){
        System.out.println("I am private 1");
    }
    private void mes(int x){
        System.out.println("I'm private 2");
    }
    
    public static void x1(){
        System.out.println("Kalyan!");
    }
    public static void x1(int x){
        System.out.println(x);
    }
    
    public void message(){
        System.out.println("xwwwy");
    }
}
class A2 extends A1{
    
    public void message(int y){
        System.out.println("Hello " + y);
    }
}
class Main1{
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        
        A2 obj = new A2();
        
        obj.x1();
        obj.x1(25);
        obj.message();
        obj.message(50);
    }
}