// Design a class 'Time' having data members hour, minute and second

import java.util.Scanner;

class Time {
    int hour;
    int minute;
    int second;
    
    Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    
    void displayTime() {
        System.out.printf("%02d:%02d:%02d\n", hour, minute, second);
    }
    
    Time addTime(Time t) {
        int totalSeconds = this.second + t.second;
        int totalMinutes = this.minute + t.minute + totalSeconds / 60;
        int totalHours = this.hour + t.hour + totalMinutes / 60;
        
        return new Time(totalHours % 24, totalMinutes % 60, totalSeconds % 60);
    }
}

public class Q10_Time {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter first time:");
        System.out.print("Hour: ");
        int h1 = sc.nextInt();
        System.out.print("Minute: ");
        int m1 = sc.nextInt();
        System.out.print("Second: ");
        int s1 = sc.nextInt();
        
        System.out.println("Enter second time:");
        System.out.print("Hour: ");
        int h2 = sc.nextInt();
        System.out.print("Minute: ");
        int m2 = sc.nextInt();
        System.out.print("Second: ");
        int s2 = sc.nextInt();
        
        Time t1 = new Time(h1, m1, s1);
        Time t2 = new Time(h2, m2, s2);
        
        System.out.print("First time: ");
        t1.displayTime();
        
        System.out.print("Second time: ");
        t2.displayTime();
        
        Time sum = t1.addTime(t2);
        System.out.print("Sum: ");
        sum.displayTime();
        
        sc.close();
    }
}
