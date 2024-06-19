package src;
public class Constructors {
    public static void main(String[] args) {
        Human person = new Human("lox",15);
        person.GetInfo();
    }
}
 class Human  {
    public void GetInfo() {
        System.out.println(name + age);
    }

    public Human(String name, int age) {
        this.name = name;
        System.out.println("its done");
        this.age = age;
    }

    private String name;
    private int age;

    public void setName(String name) {this.name=name;}
    public void setAge(int age) {this.age=age;}
 }