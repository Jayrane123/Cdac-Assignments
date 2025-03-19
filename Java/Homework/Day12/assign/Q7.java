import java.io.*;

class FileNotFoundDemo {
    public static void main(String args[]) {
        try {
            FileReader fr = new FileReader("non_existent_file.txt");
            System.out.println("File opened successfully.");
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found - " + e.getMessage());
        }
        System.out.println("Execution completed.");
    }
}
