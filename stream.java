import java.util.*;
import java.util.stream.Collectors;
 
public class stream {
    public static void main(String[] args)
    {
        Student st1 = new Student("Anna", 16, 'f');
        Student st2 = new Student("Maksim", 19, 'm');
        Student st3 = new Student("Olga", 21, 'f');
        List<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        System.out.println(students);
        System.out.println("-------------------------------------------");
        List<Student> filteredtudents = students.stream().filter(e->e.age>17&&e.name.length()>4).collect(Collectors.toList());
        System.out.println(filteredtudents);
        System.out.println("-------------------------------------------");
        List<Integer> mappedstudents = students.stream().map(e->e.name.length()).collect(Collectors.toList());
        System.out.println(mappedstudents);
        System.out.println("-------------------------------------------");
        int[] array = {5, 12, 2, 51, 52, 42};
        Arrays.stream(array).forEach(e->System.out.println(e));
        System.out.println("-------------------------------------------");
        Arrays.stream(array).forEach(System.out::println);
        System.out.println("-------------------------------------------");
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(6);
        list.add(2);
        Optional<Integer> o = list.stream().reduce((a, e) -> a*e);
        if (o.isPresent()){System.out.println(o.get());}
        else {System.out.println("null");}
        System.out.println("-------------------------------------------");
    }
}
class Student {
    String name;
    int age;
    char sex;
    public Student(String name, int age, char sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }
    @Override
    public String toString() {
        return name+", "+age+", "+sex;
    }
} 