package serialazation;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadObject {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("C:\\Users\\Yarik\\test\\usersunfo");
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            
            // Attempt to read two UserInfo objects
            try {
                UserInfo user1 = (UserInfo) ois.readObject();
                user1.getInfo();
                
                UserInfo user2 = (UserInfo) ois.readObject();
                user2.getInfo();
                System.out.println("Sdsd");
                
            } catch (ClassNotFoundException | IOException e) {
                System.out.println("ClassNotFoundException | IOException e");
            }
        } catch (IOException e) {
            System.out.println("ClassNotFoundException | ");
        }
    }
}
