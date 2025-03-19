import java.io.*;

class Q6 {
    public static void main(String[] args) {
        try {
            FileReader file = new FileReader("nonexistent.txt");
            BufferedReader reader = new BufferedReader(file);
            System.out.println(reader.readLine());
            reader.close();
        } catch (IOException e) {
            System.out.println("Exception: " + e.getMessage());
        }
        System.out.println("Finished");
    }
}
