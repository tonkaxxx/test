package lesson37;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class writeToFile {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("test");
        try (PrintWriter prwr = new PrintWriter(file)) {
            prwr.println("12312312312r2rf");
        }
    }
}
