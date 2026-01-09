public class SwapWithThirdVar {
    public static void main(String[] args){

        int a = 10;
        int b = 20;
        int c = a;
        a = b;
        b = c;
        System.out.println("Swapped numbers are : a = " + a + " and b = " + b);
    }
}
