package lesson37;

public class recursions {
    public static void main(String[] args) {
        count(5);
    }
    public static void count(int n) {
        while(n>=0) {
            System.out.println(n);
            count(n-1);
        }
    }
}
