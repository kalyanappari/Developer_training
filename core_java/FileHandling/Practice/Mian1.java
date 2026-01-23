import java.io.File;
import java.io.IOException;
public class Mian1 {
    public static void main(String[] args) throws IOException {
        
        File folder = new File("Kalyan");

        if(folder.mkdir()){
            System.out.println("Folder is created");
        }
        else{
            System.out.println("Folder already exists!");
        }

        if(folder.exists()){

            File file = new File(folder,"abc.txt");

            if(file.createNewFile()){
                System.out.println("File is created in the folder named kalyan");
            }
            else{
                System.out.println("File is already exists");
            }

            /*if(file.delete()){
                System.out.println("File Deleted successfully!");
            }
            else{
                System.out.println("File doesn't exists!");
            }*/
           
        }
    }
}
