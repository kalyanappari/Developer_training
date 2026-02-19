public class EnumWithSpecifiedValue {

    enum Day{

        Monday(100),Tuesday(200),Wednesday(300),Thurusday(400),
        Firday(500),Saturday(600),Sunday(700);

        int val;

        Day(int val){
            this.val = val;
        }

        public int getValue(){
            return val;
        }
    }
    public static void main(String[] args) {

        Day day = Day.Monday;

        System.out.println(day);

        System.out.println(day.getValue());
        
    }
}