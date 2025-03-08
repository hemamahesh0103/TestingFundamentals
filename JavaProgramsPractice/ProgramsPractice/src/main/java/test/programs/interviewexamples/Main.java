package test.programs.interviewexamples;

import test.programs.classandobjects.BankDemo;

public class Main {
    public static void main(String[] args) {
        BankDemo hdfc = new BankDemo();
        hdfc.setAccountName("Vamsi Krishna");
        hdfc.setAccountNo(323234892);
        hdfc.setAccountBalance(432323232);
        hdfc.setAccountActive(true);

        System.out.println(hdfc.getAccountName());


    }
}
