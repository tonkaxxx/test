import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("enter first num");
        try (Scanner scanner = new Scanner(System.in)) {
            int firstuser = Integer.parseInt(scanner.nextLine());
            
            System.out.println("enter second num");
            int seconduser = Integer.parseInt(scanner.nextLine());
            
            System.out.println("enter action");
            String action = scanner.nextLine();
            
            switch(action) {
                case "+" -> sum(firstuser, seconduser);
                case "-" -> minus(firstuser, seconduser);
                case "/" -> devide(firstuser, seconduser);
                case "%" -> mod(firstuser, seconduser);
            }
        }
    }
    static void sum (int first, int second) {System.out.println(first + second);}
    static void minus (int first, int second) {System.out.println(first - second);}
    static void devide (int first, int second) {System.out.println(first/second);}
    static void mod (int first, int second) {System.out.println(first % second);} 
}