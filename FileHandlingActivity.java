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
            Files.createFile(Paths.get("notes.txt"));
            Files.createFile(Paths.get("data.txt"));
            Files.createFile(Paths.get("log.txt"));
        } catch (Exception e) {
            // TODO: handle exception
        }

        // c. Write messages to files
        
         try {
            Files.write(Paths.get("notes.txt"), "Fortnite".getBytes(StandardCharsets.UTF_8));
            Files.write(Paths.get("data.txt"), "Battle".getBytes(StandardCharsets.UTF_8));
            Files.write(Paths.get("log.txt"), "Pass".getBytes(StandardCharsets.UTF_8));
        } catch (Exception e) {
            // TODO: handle exception
        }

        // d. Read and display file contents

        try {
            String notes = new String(Files.readAllBytes(Paths.get("notes.txt")));
            String data = new String(Files.readAllBytes(Paths.get("data.txt")));
            String log = new String(Files.readAllBytes(Paths.get("log.txt")));
            System.out.println("notes.txt: " + notes);
            System.out.println("data.txt: " + data);
            System.out.println("log.txt: "+log);
        } catch (Exception e) {
            // TODO: handle exception
        }
        
        // e. Create backup directory
        
        // f. Copy contents to backup file
        
        // g. List all files in both directories
    }
}