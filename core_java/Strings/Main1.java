public class Main1 {
    public static void main(String[] args){

        String s = "Geeks for Geeks";

        System.out.println(s.length());
        System.out.println(s.substring(0,5));
        System.out.println(s.indexOf("Geeks"));
        System.out.println(s.lastIndexOf("G"));
        System.out.println(s.indexOf("e",5));

        String s1 = "geeks for geeks";

        System.out.println(s.equals(s1));
        System.out.println(s.equalsIgnoreCase(s1));

        System.out.println(s1.replace('e', '@'));
        System.out.println(s.replaceAll("[aeiouAEIOU]", "@"));
        System.out.println(s1.contains(s));
        System.out.println(s.contains("G"));

        char[] arr = s.toCharArray();

        for(char ch : arr){
            System.out.print(ch);
        }
    }
}
