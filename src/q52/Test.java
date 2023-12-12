package q52;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Test {
    public static void main(String[] args) {
        char[] buffer = new char[8];
        int count = 0;
        try(FileReader in = new FileReader("C:\\Users\\ahmed.elsayed\\Documents\\java\\in.txt");
            FileWriter out = new FileWriter("C:\\Users\\ahmed.elsayed\\Documents\\java\\out.txt")){
            while ((count = in.read(buffer)) != -1){
                out.write(buffer);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
