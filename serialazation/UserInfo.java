package serialazation;

import java.io.Serializable;

public class UserInfo implements Serializable{
    String username;
    Integer age;

    public UserInfo(Integer age, String username) {
        this.age = age;
        this.username = username;
    }
`
    public String getUsername() {
        return username;
    }

    public void getInfo() {
        System.out.println("Name: " + username + ", Age: " + age);
    }
    
}

