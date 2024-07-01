package serialazation;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadObject {
<<<<<<< HEAD
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

=======
    public static void main(String[] args) throws java.io.NotSerializableException {
        try {FileInputStream fis = new FileInputStream("usersInfo");
            ObjectInputStream ois = new ObjectInputStream(fis);
            UserInfo user1 = (UserInfo) ois.readObject();
            UserInfo user2 = (UserInfo) ois.readObject();
            user1.getInfo();
            user2.getInfo();
            ois.close();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
>>>>>>> 0ff4e34367e2e05b4bcf97c9442877077f6fb3b6
            }
            // Handle IOException
            
            
<<<<<<< HEAD
        } catch (IOException e) {
            // Handle IOException from FileInputStream or ObjectInputStream instantiation

        }
    }
=======
        
    }        
>>>>>>> 0ff4e34367e2e05b4bcf97c9442877077f6fb3b6
}
