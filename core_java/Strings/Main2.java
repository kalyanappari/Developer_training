public class Main2 {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Kalyan");

        sb.append(" Appari");

        System.out.println(sb);

        sb.replace(0,6,"Vardhini");

        System.out.println(sb);

        sb.setCharAt(0,'v');

        sb.insert(8, " Kalyan ");

        System.out.println(sb);

        sb.deleteCharAt(1);

        System.out.println(sb);

        sb.reverse();

        System.out.println(sb);

        
    }
}
