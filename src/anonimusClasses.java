package src; 

public class anonimusClasses {
    public static void main(String[] args) {
        albeToSleep ats = new albeToSleep() {
            public void sleep(){
                System.out.println("ZZZZZZ");
            }
        };
        ats.sleep();
    }
}
