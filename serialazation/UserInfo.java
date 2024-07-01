package serialazation;

import java.io.Serializable;

<<<<<<< HEAD
public class UserInfo implements Serializable{
    String username;
    public String getUsername() {
        return username;
=======
public class UserInfo implements Serializable {
    // Define the fields and methods of the UserInfo class
    // For example:
    private String name;
    private int age;

    public UserInfo(String name, int age) {
        this.name = name;
        this.age = age;
>>>>>>> 0ff4e34367e2e05b4bcf97c9442877077f6fb3b6
    }

    public void getInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

