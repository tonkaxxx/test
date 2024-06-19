package src;
public class This {
    public static void main(String[] args) {
        UserData user1 = new UserData();
        user1.SetUsername("User");
        user1.SetPassword(1234);
        user1.GetInfo();
    }
}   
    class UserData{
        String username;
        int password;

    public void GetInfo(){
        System.out.println(username+", "+password);
    }

    public void SetUsername(String username) {
        if (this.username.isEmpty()) {
            System.out.println("ERROR IN NAME!!!!!!!");
        } else {this.username = username;}
    }

    public String GetUsername(){
        return username;
    }

    public void SetPassword(int password){
        if (this.password>999&&this.password<10000) {
            this.password = password;
        } else {System.out.println("PASSEORD MUST BE 4 NUMBERS!!!");}
    }

    public int GetPassword() {
        return password;
    }
    }
    