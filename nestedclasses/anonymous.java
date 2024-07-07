package nestedclasses;

public class anonymous {
    public static void main(String[] args) {
        Math sum = new Math() {
            @Override
            public int dosmth(int a, int b) {
                return a + b;
            }
        };

        MyName nameObj = new MyName() {
            @Override
            public String introduce(String name) {
                name = "Yaroslav";
                return name;
            }
        };

        // Вызов методов анонимных классов
        System.out.println(sum.dosmth(3, 5)); // Выведет 8
        System.out.println(nameObj.introduce("Yaroslav")); // Выведет "Yaroslav"
    }
}

interface Math {
    int dosmth(int a, int b);
}

abstract class MyName {
    abstract String introduce(String name);
}