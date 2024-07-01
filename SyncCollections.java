import java.util.*;

public class SyncCollections {
    public static void main(String[] args) throws InterruptedException {
        ArrayList<String> names = new ArrayList<>();
        List<String> synlist = Collections.synchronizedList(names);
        synlist.add("Alex");
        synlist.add("Max");
        synlist.add("Elis");
        synlist.add("Mike");
        synlist.add("Tom");

        Runnable run1 = () -> {
            synchronized (synlist) {
                Iterator<String> it = synlist.iterator();
                while (it.hasNext()) {
                    System.out.println(it.next());
                }
            }
        };

        Runnable run2 = () -> {
            synchronized (synlist) {
                synlist.remove(1);
            }
        };

        Thread th1 = new Thread(run1);
        Thread th2 = new Thread(run2);

        th1.start();
        th2.start();

        th1.join();
        th2.join();

        System.out.println(synlist);
    }
}