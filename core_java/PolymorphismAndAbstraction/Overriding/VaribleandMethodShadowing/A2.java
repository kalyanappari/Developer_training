class A2 extends A1{

    int x = 100;
    int y = 200;

    static int z = 300;
    final int k = 500;

    static void message(){
        System.out.println("Child static");
    }
    /*void message2(){
        System.out.println("Parent final");
    }*/ //Final methods not even supports the method hiding also. so it throws the error.
    void message3(){
        System.out.println("Child private");
    }

}
