
import java.util.ArrayList;

public class WaitNotify {
    public static void main(String[] args) {
        BlockingQueue queue = new BlockingQueue(); 

        Thread worker = new Thread(new Runnable() {
            public void run() {
                while (true) { 
                    Runnable task = queue.get();
                    task.run();
                }
            }
        });
        worker.start();
        for (int i = 0; i < 11; i++){
            queue.put(getTask());
        }
    }

    public static Runnable getTask() {
        return new Runnable() {
            @Override
            public void run() {
                System.out.println("started: "+this);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {}
                System.out.println("finish: "+this);
            }
        };
    }

    static class BlockingQueue {
        ArrayList<Runnable> tasks = new ArrayList<>();

        public synchronized Runnable get(){
            while (tasks.isEmpty()) {
                try {
                    wait();
                } catch (InterruptedException e) {}            
            }
            Runnable task = tasks.get(0);
            tasks.remove(task);
            return task;
        }
        public synchronized void put(Runnable task){
            tasks.add(task);
            notify();
        }
    }

}
