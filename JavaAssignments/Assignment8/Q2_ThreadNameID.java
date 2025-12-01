// Create thread and display name, ID, and alive status

public class Q2_ThreadNameID {
    public static void main(String[] args) {
        Thread myThread = new Thread(new Runnable() {
            public void run() {
                System.out.println("Thread is running...");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Thread finished execution");
            }
        });
        
        myThread.setName("MyCustomThread");
        
        System.out.println("Before starting thread:");
        System.out.println("Thread Name: " + myThread.getName());
        System.out.println("Thread ID: " + myThread.getId());
        System.out.println("Is Alive: " + myThread.isAlive());
        
        myThread.start();
        
        System.out.println("\nAfter starting thread:");
        System.out.println("Thread Name: " + myThread.getName());
        System.out.println("Thread ID: " + myThread.getId());
        System.out.println("Is Alive: " + myThread.isAlive());
        
        try {
            myThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        System.out.println("\nAfter thread completion:");
        System.out.println("Is Alive: " + myThread.isAlive());
    }
}
