
import java.util.concurrent.ArrayBlockingQueue;

public class arrbloque {
    public static void main(String[] args) throws InterruptedException {
        ArrayBlockingQueue<Integer> queue = new ArrayBlockingQueue<>(3);
        Runnable provider = () -> {
            for (int i = 1; i<6; i++) {
                try {
                    queue.put(i);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    System.out.println("provider interrupted by smth");
                }
                System.out.println("provider "+queue);
            }
        };
        Runnable consumer = () -> {
            for (int i = 1; i<6; i++) {
                
                try {
                    Thread.sleep(1500);
                } catch (InterruptedException e) {
                    System.out.println("consumer interrupted by smth");
                }
                try {
                    queue.take();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("consumer "+queue);
            }
        };
        Thread pt = new Thread(provider);
        Thread ct = new Thread(consumer);
        pt.start();
        ct.start();
        pt.join();
        ct.join();
        System.out.println(queue);
    }
}