import java.io.*;
import java.nio.file.*;
import java.nio.charset.StandardCharsets;

public class FileHandlingActivity {
    public static void main(String[] args) {
        // Your code here
        
        // a. Create main directory

        File dir = new File("main");
        dir.mkdir();
        
        // b. Create three text files

        try {
            Files.write(Paths.get("notes.txt"), "Password".getBytes(StandardCharsets.UTF_8));
            Files.write(Paths.get("data.txt"), "Password".getBytes(StandardCharsets.UTF_8));
            Files.write(Paths.get("log.txt"), "Password".getBytes(StandardCharsets.UTF_8));
        } catch (Exception e) {
            // TODO: handle exception
        }


        // c. Write messages to files
        
        // d. Read and display file contents
        
        // e. Create backup directory
        
        // f. Copy contents to backup file
        
        // g. List all files in both directories
    }
}