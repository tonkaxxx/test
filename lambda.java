public class lambda {
    static void showlength(SomeInterfase interfaseclass){
        System.out.println(interfaseclass.abc("halo"));
    }
    public static void main(String[] args) {
        showlength(e -> e.length());
    }
}
interface SomeInterfase {
    int abc (String s);
}
