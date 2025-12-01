// Abstract class Bank with abstract method getROI()

import java.util.Scanner;

abstract class Bank {
    abstract int getROI();
}

class SBI extends Bank {
    int getROI() {
        return 8;
    }
}

class PNB extends Bank {
    int getROI() {
        return 7;
    }
}

class BOI extends Bank {
    int getROI() {
        return 9;
    }
}

public class Q1_BankROI {
    public static void main(String[] args) {
        Bank sbi = new SBI();
        Bank pnb = new PNB();
        Bank boi = new BOI();
        
        System.out.println("SBI Rate of Interest: " + sbi.getROI());
        System.out.println("PNB Rate of Interest: " + pnb.getROI());
        System.out.println("BOI Rate of Interest: " + boi.getROI());
    }
}
