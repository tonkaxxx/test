package src.exstends;

public class exstends {
    public static void main(String[] args) {
        dog glrt = new dog("golden");
        Animal animal = new Animal("black");
        glrt.eat();
        glrt.sleep();
        glrt.bark();
        glrt.showInfo();
        animal.showInfo();
    }
}
