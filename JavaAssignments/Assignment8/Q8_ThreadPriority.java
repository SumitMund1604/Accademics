// Create two threads and set different priorities

class MyThread extends Thread {
    String threadName;
    
    MyThread(String name) {
        this.threadName = name;
    }
    
    public void run() {
        System.out.println(threadName + " is running with priority: " + getPriority());
        for (int i = 1; i <= 5; i++) {
            System.out.println(threadName + " - Count: " + i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(threadName + " completed");
    }
}

public class Q8_ThreadPriority {
    public static void main(String[] args) {
        MyThread t1 = new MyThread("Thread-1");
        MyThread t2 = new MyThread("Thread-2");
        
        // Set priorities
        t1.setPriority(Thread.MIN_PRIORITY);  // Priority 1
        t2.setPriority(Thread.MAX_PRIORITY);  // Priority 10
        
        System.out.println("Thread-1 Priority: " + t1.getPriority());
        System.out.println("Thread-2 Priority: " + t2.getPriority());
        
        t1.start();
        t2.start();
    }
}
