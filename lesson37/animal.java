package lesson37;

public class animal {
    private int age;

    public animal(int age){
        this.age = age;
    }
    public boolean equals(Object obj){
        animal otherAnimal = (animal) obj;
        return this.age == otherAnimal.age;
    }
}
