package serialazation;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject {
    public static void main(String[] args) {
        UserInfo user1 = new UserInfo("tonka", 123);
        UserInfo user2 = new UserInfo("roman", 456);
        try {
            FileOutputStream fos = new FileOutputStream("usersInfo.bin");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(user1);
            oos.writeObject(user2);
            oos.close();
        } catch (IOException e) {
            System.out.println("no such file in directory");
        }
    }
}

