import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.File;
import java.util.ArrayList;

public class Main1 {
    public static void main(String[] args){

        File file = new File("employees.txt");

        ArrayList<Employee> list = new ArrayList<>();

        list.add(new Employee(101,"Sriram","JavaFullStack",750000));
        list.add(new Employee(102,"Kalyan","JavaFullStack",750000));

        try(BufferedWriter bw = new BufferedWriter(new FileWriter(file))){

            bw.write("ID   Name      Dept     Salary");
            bw.newLine();
            bw.write("------------------------------");
            bw.newLine();
            for(Employee e : list){
                bw.write(e.toString());
                bw.newLine();
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }

        // bw.close();
    }
}
