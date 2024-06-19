package src;

import java.util.ArrayList;  
import java.util.List;

public class genericsWildcards {
    public static void main(String[] args) {
        List<Animal> anilist = new ArrayList<>();
        anilist.add(new Animal());
        anilist.add(new Animal());
        List<dog> doglist = new ArrayList<>();
        doglist.add(new dog());
        doglist.add(new dog());
        System.out.println("lox");
    }

    void test (List<? extends Animal> list){
        for (Animal animal : list) {
            animal.eat();
        }
    }
}

