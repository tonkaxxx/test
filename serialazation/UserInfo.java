package serialazation;

import java.io.Serializable;

public class UserInfo implements Serializable{
    String username;
    public String getUsername() {
        return username;
    }
    int password; 
    public int getPassword() {
        return password;
    }
    public UserInfo (String username, int password){
        this.username = username;
        this.password = password;
    }
    public String getInfo(){
        return username+" , "+password;
    }
}

