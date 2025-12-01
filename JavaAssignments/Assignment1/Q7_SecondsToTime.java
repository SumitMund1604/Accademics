// Write a program to input the time value in seconds and then display it in the hour: minute: second format using the modulus operator (%).

import java.util.Scanner;

public class Q7_SecondsToTime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the time in seconds: ");
        int totalSeconds = sc.nextInt();
        
        int hours = totalSeconds / 3600;
        int minutes = (totalSeconds % 3600) / 60;
        int seconds = totalSeconds % 60;
        
        System.out.println(hours + " Hour: " + minutes + " minute: " + seconds + " seconds");
        
        sc.close();
    }
}
