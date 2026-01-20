import java.io.File;
import java.io.IOException;

class A1{

    static File file = new File("file1.txt");
    static File rootfolder = new File("Files/handling/folders");

}
public class Main2 {    

    public static void main(String[] args) throws IOException{

        if(A1.file.createNewFile()){
            System.out.println("File created Successfully");
        }
        else{
            System.out.println("Already exists!");
        }

         if(A1.rootfolder.mkdirs()){
            System.out.println("Root folders is created!");
        }
        else{
            System.out.println("Already exists!");
        }
        
    }
}
