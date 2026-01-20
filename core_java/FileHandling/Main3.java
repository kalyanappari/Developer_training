import java.io.*;
public class Main3 {

    public static void main(String[] args)throws IOException{

        File file = new File(A1.rootfolder,"def.txt");

        if(file.createNewFile()){
            System.out.println("File is created in the its root path!");
        }
        else{
            System.out.println("File already exists!");
        }

        
    }
}
