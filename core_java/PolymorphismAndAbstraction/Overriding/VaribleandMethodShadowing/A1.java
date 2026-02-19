class A1 {

    int x = 10;
    int y = 20;

    static int z = 30;
    final int k = 40;
    static void message(){
        System.out.println("Parent static");
    }
    final void message2(){
        System.out.println("Parent final");
    }

    private void message3(){
        System.out.println("Parent private");
    }

    public void call(){
        message3();
    }
}
