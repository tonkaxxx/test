package lesson37;

public class recursions {
    public static void main(String[] args) {
        count(5);
    }
    public static void count(int n) {
<<<<<<< HEAD
        while(n>=0) {
            System.out.println(n);
            count(n-1);
=======
        if (n>0) {
            System.out.println(n);
            count(n-1);
        } else {
            return;
>>>>>>> 0ff4e34367e2e05b4bcf97c9442877077f6fb3b6
        }
    }
}
