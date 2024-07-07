package nestedclasses;

public class local_inner_1 {
    public static void main(String[] args) {
        Math math = new Math();
        math.GetResult();
    }
}

class Math{
    public void GetResult() {
        class Delenie {
            private int delimoe;
            private int delitel;

            public int getDelimoe() {
                return delimoe;
            }

            public void setDelimoe(int delimoe) {
                this.delimoe = delimoe;
            }

            public int getDelitel() {
                return delitel;
            }

            public void setDelitel(int delitel) {
                this.delitel = delitel;
            }
            public double getChastnoe() {
                return delimoe/delitel;
            }
            public int getOstatok() {
                return delimoe%delitel;
            }
            
        }
        Delenie delii = new Delenie();
        delii.setDelimoe(21);
        delii.setDelitel(20);
        System.out.println("delimoe: "+delii.getDelimoe());
        System.out.println("delitel: "+delii.getDelitel());
        System.out.println("chastnoe: "+delii.getChastnoe());
        System.out.println("ostatok: "+delii.getOstatok());
    }
}
