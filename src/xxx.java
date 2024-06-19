package src;

public class xxx {
    public static void main(String[] args) {
        FindMax first = new FindMax();
        first.SetA(10);
        first.SetB(112);
        first.MathMax();
       }
}

class FindMax {
    private int a;
    private int b;
    void MathMax() {
        if (a>b) {
            System.out.println("1 num is bigger");;
        } else if (a==b) {
            System.out.println("Numbers are equal");
        } else {System.out.println("2 num is bigger");}
        
    }
    void SetA(int a1){
        if (a1<0){
            System.out.println("ERROR IN A!!!!!!!!!!!!!!");
        } else {a1=a;}
    }
    int GetA(){
        return a;
    }
    void SetB(int b1){
        if (b1<0){
            System.out.println("ERROR IN B!!!!!!!!!!!!!!");
        } else {b1=b;}
    }
    int GetB(){
        return b;
    }
}