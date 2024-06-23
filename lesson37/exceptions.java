package lesson37;



import java.io.IOException;
import java.util.Scanner;

public class exceptions {
    /**
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws ScannerException {
        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                int userint = Integer.parseInt(scanner.nextLine());
            
            if (userint==0) {
                throw new ScannerException("ti lox, ne vvodi 0");
            } else {System.out.println(userint);}
            }
        } catch (NumberFormatException e) {
        }
    }
}
