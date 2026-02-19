//Buffered File Reader from employee.txt
import java.util.*;
import java.io.*;
public class Main2 {
    public static void main(String[] args) {

        try(BufferedReader br = new BufferedReader(new FileReader("Employees.txt"))){

            /*int file = br.read();

            while(file != -1){
                System.out.print((char)file);
                file = br.read();
            }*/

            String line = "";

            while((line = br.readLine()) != null){
                System.out.println(line);
            }
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}
