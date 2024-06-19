package src.exstends;

public class Animal implements info{
    public String hairColor;
    public Animal(String hairColor){this.hairColor=hairColor;}
    public void eat() { System.out.println("im eating");    }
    public void sleep() { System.out.println("im sleeping");    }
    public void showInfo() {System.out.println(hairColor); }
}
 