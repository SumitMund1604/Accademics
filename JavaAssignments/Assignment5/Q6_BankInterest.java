// Bank classes showing rate of interest

class Bank {
    int getROI() {
        return 0;
    }
}

class SBI extends Bank {
    int getROI() {
        return 8;
    }
}

class ICICI extends Bank {
    int getROI() {
        return 7;
    }
}

class AXIS extends Bank {
    int getROI() {
        return 9;
    }
}

public class Q6_BankInterest {
    public static void main(String[] args) {
        SBI sbi = new SBI();
        ICICI icici = new ICICI();
        AXIS axis = new AXIS();
        
        System.out.println("SBI Rate of Interest: " + sbi.getROI());
        System.out.println("ICICI Rate of Interest: " + icici.getROI());
        System.out.println("AXIS Rate of Interest: " + axis.getROI());
    }
}
