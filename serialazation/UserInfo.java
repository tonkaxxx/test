package serialazation;

import java.io.Serializable;

public class UserInfo implements Serializable {
    // Define the fields and methods of the UserInfo class
    // For example:
    private String name;
    private int age;

    public UserInfo(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void getInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

