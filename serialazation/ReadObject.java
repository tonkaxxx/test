package serialazation;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadObject {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("usersInfo");
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            
            // Attempt to read two UserInfo objects
            try {
                UserInfo user1 = (UserInfo) ois.readObject();
                user1.getInfo();
                
                UserInfo user2 = (UserInfo) ois.readObject();
                user2.getInfo();
                
            } catch (ClassNotFoundException | IOException e) {
                // Handle ClassNotFoundException

            }
            // Handle IOException
            
            
        } catch (IOException e) {
            // Handle IOException from FileInputStream or ObjectInputStream instantiation

        }
    }
}
