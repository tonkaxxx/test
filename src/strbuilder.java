package src;
public class strbuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        System.out.println(sb.toString());
        sb.append(" lox").append(" mraz");
        System.out.println(sb.toString());
    }
}