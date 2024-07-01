import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Compar {
    public static void main(String[] args) {
        ArrayList<Animal> arrani = new ArrayList<>();
        Animal a1 = new Animal("black", 12, 'f');
        Animal a2 = new Animal("white", 52, 'm');
        Animal a3 = new Animal("red", 61, 'm');
        arrani.add(a1);
        arrani.add(a2);
        arrani.add(a3);
        System.out.println("before sorting /n"+arrani);
        Collections.sort(arrani, new ColorComparator());
        System.out.println("after sorting by color /n"+arrani);

        Collections.sort(arrani, new IdComparator());
        System.out.println("after sorting by id /n"+arrani);

        Collections.sort(arrani, new SexComparator());
        System.out.println("after sorting by sex /n"+arrani);
    }
}
class Animal {
    Integer id;
    String color;
    Character sex;
    public Animal(String color, Integer id, Character sex) {
        this.color = color;
        this.id = id;
        this.sex = sex;
    }
}
class ColorComparator implements Comparator<Animal> {
    @Override
    public int compare(Animal a1, Animal a2) {
        return a1.color.compareTo(a2.color);
    }
}
class IdComparator implements Comparator<Animal> {
    @Override
    public int compare(Animal a1, Animal a2) {
        return a1.id.compareTo(a2.id);
    }
}
class SexComparator implements Comparator<Animal> {
    @Override
    public int compare(Animal a1, Animal a2) {
        return a1.sex.compareTo(a2.sex);
    }
}