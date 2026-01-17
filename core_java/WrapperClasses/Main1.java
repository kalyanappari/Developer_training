public class Main1 {
    public static void main(String[] args) {
        
        Integer x = 100;

        int num = x; //Auto-Unboxing.

        int num2 = 200;

        Integer x2 = num2; //Auto-boxing.

        System.out.println(num);
        System.out.println(x2);

        Integer n1 = 100;

        //Converting to the primitive with the methods.

        int a = n1.intValue();
        System.out.println(a);

        long b = n1.longValue();
        System.out.println(b);

        double d = n1.doubleValue();
        System.out.println(d);

        //Implicit conversion unboxing + widening.

        int a1 = n1;
        System.out.println(a1);
        long b1 = n1;
        System.out.println(b1);
        double d1 = n1;
        System.out.println(d1);

        //Convrting to Wrapper through the methods.

        int val = 500;

        Integer obj = Integer.valueOf(500);
        System.out.println(obj);

        Long obj1 = Long.valueOf(val);

        System.out.println(obj1);

        Float obj2 = Float.valueOf(val);

        System.out.println(obj2);

        //Implicit conversion through autoBoxing + widening.

        int val = 20;
        Long obj3 = val;
        System.out.println(obj3);

        Double obj4 = val;
        System.out.println(obj4);

        Float obj5 = val;
        System.out.println(obj5);
    }
}
