import java.io.*;
import java.nio.file.*;
import java.nio.charset.StandardCharsets;

public class FileHandlingActivity {
    public static void main(String[] args) {
        // Your code here
        
        // a. Create main directory

        File dir = new File("JavaFileSystem");
        dir.mkdir();
        
        // b. Create three text files

        try {
            Files.createFile(Paths.get("JavaFileSystem/notes.txt"));
            Files.createFile(Paths.get("JavaFileSystem/data.txt"));
            Files.createFile(Paths.get("JavaFileSystem/log.txt"));
        } catch (Exception e) {
            // TODO: handle exception
        }

        // c. Write messages to files
        
         try {
            Files.write(Paths.get("JavaFileSystem/notes.txt"), "Fortnite".getBytes(StandardCharsets.UTF_8));
            Files.write(Paths.get("JavaFileSystem/data.txt"), "Battle".getBytes(StandardCharsets.UTF_8));
            Files.write(Paths.get("JavaFileSystem/log.txt"), "Pass".getBytes(StandardCharsets.UTF_8));
        } catch (Exception e) {
            // TODO: handle exception
        }

        // d. Read and display file contents

        try {
            String notes = new String(Files.readAllBytes(Paths.get("JavaFileSystem/notes.txt")));
            String data = new String(Files.readAllBytes(Paths.get("JavaFileSystem/data.txt")));
            String log = new String(Files.readAllBytes(Paths.get("JavaFileSystem/log.txt")));
            System.out.println("notes.txt: " + notes);
            System.out.println("data.txt: " + data);
            System.out.println("log.txt: "+log);
        } catch (Exception e) {
            // TODO: handle exception
        }
        
        // e. Create backup directory

        Path dirr = Paths.get(Paths.get("JavaFileSystem").toString(), "Backup");
        try {
            Files.createDirectories(dirr);
        } catch (Exception e) {
            // TODO: handle exception
        }
        
        // f. Copy contents to backup file
        try {
            String notes = new String(Files.readAllBytes(Paths.get("JavaFileSystem/notes.txt")));
            String data = new String(Files.readAllBytes(Paths.get("JavaFileSystem/data.txt")));
            String log = new String(Files.readAllBytes(Paths.get("JavaFileSystem/log.txt")));
            String text = notes + data + log;
            Files.write(Paths.get("JavaFileSystem/Backup").resolve(Paths.get("backup.txt")), text.getBytes(StandardCharsets.UTF_8));
        } catch (Exception e) {
            // TODO: handle exception
        }
        
        // g. List all files in both directories
        try {
            String str = new String();
            File main = new File("JavaFileSystem");
            File backup = new File("JavaFileSystem/Backup");
            str += "Contains:\n";
            for (File file : main.listFiles()) {
                if (file.toString().contains(".txt")) {
                    str += file + "\n";
                }                  
            }
            for (File file : backup.listFiles()) {
                str += file + "\n";
            }
            System.out.println(str.trim());
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}