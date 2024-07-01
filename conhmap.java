import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class conhmap {
    public static void main(String[] args) throws InterruptedException {
        CopyOnWriteArrayList<Integer> cowal = new CopyOnWriteArrayList<>();
        cowal.add(1);
        cowal.add(2);
        cowal.add(3);
        cowal.add(4);
        cowal.add(5);
        System.out.println(cowal);
        System.out.println("===================================================");
        Runnable run1 = () -> {
            Iterator<Integer> it = cowal.iterator();
            while (it.hasNext()) {
                /*try {
                    hread.sleep(500);
                    System.out.println();
                } catch (InterruptedException e) {
                    System.out.println("run1 interrupted by smth");
                }
                System.out.println(it.next());*/
            }
        }; 
        Runnable run2 = () -> {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println("run2 interrupted by smth");
            }
            cowal.add(6);
            cowal.add(7);
            cowal.add(8);
        }; 
        Thread t1 = new Thread(run1); 
        Thread t2 = new Thread(run2); 
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(cowal);
    }
}
