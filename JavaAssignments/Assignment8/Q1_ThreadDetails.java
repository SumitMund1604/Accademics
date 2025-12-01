// Display thread reference details

public class Q1_ThreadDetails {
    public static void main(String[] args) {
        Thread currentThread = Thread.currentThread();
        
        System.out.println("========== Thread Details ==========");
        System.out.println("Class: " + currentThread.getClass().getName());
        System.out.println("Thread Name: " + currentThread.getName());
        System.out.println("Priority: " + currentThread.getPriority());
        System.out.println("Thread Group: " + currentThread.getThreadGroup().getName());
        System.out.println("Is Alive: " + currentThread.isAlive());
        System.out.println("===================================");
    }
}
