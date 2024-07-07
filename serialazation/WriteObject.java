package serialazation;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject {
    public static void main(String[] args) {
        UserInfo user1 = new UserInfo(123, "tonka");
        UserInfo user2 = new UserInfo(312, "roman");
        try {
            FileOutputStream fos = new FileOutputStream("usersInfo.bin");
            try (ObjectOutputStream oos = new ObjectOutputStream(fos)) {
                oos.writeObject(user1);
                oos.writeObject(user2);
                oos.close();
                System.out.println("all gooooooooood");
            }
        } catch (IOException e) {
            System.out.println("no such file in directory");
        }
    }
}

