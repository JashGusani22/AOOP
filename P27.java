import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class InputFile {
    public static void main(String[] args) throws Exception {
        String filepath = "sample.txt";

        FileWriter write = new FileWriter(filepath);

        write.write("Hello, How are You I am Jash Gusani!!");
        write.close();
        System.out.println("File Writed Successfully");

        BufferedReader reader = new BufferedReader(new FileReader(filepath));

        String line;
        System.out.println("\n Reading From File");
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }
        reader.close();
    }
}
