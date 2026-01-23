enum Color{

    RED,GREEN,BLUE,BLACK;

    //Constructor.

    private Color(){
        System.out.println("Constructor of color: " + this);
    }

    static{
        System.out.println("Static Block of the Color enum!");
    }

}
public class Main1 {

    public static void main(String[] args) {
        
        Color c1 = Color.RED;

        System.out.println(c1);

        System.out.println(Color.valueOf("RED"));

        //Iteration using the enumType.values

        for(Color c : Color.values()){
            System.out.println(c);
        }

        //Printing the value.

    }
}
