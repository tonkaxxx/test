package serialazation;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadObject {
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
            }
            
        
    }        
}
