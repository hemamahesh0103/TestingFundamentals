package test.programs.interviewexamples;

import test.programs.classandobjects.BankDemo;
import test.programs.classandobjects.Persons;
import test.programs.classandobjects.cars;
import test.programs.classandobjects.dog;

public class Main {
    public static void main(String[] args) {
        BankDemo hdfc = new BankDemo();
        hdfc.setAccountName("Vamsi Krishna");
        hdfc.setAccountNo(323234892);
        hdfc.setAccountBalance(432323232);
        hdfc.setAccountActive(true);

      //  System.out.println(hdfc.getAccountName());

        Persons p = new Persons();

        p.setAge(25);
        p.setName("Mahesh");

       // System.out.println(p.getAge());
        // System.out.println(p.getName());

        dog d = new dog();
        d.setName("German Shepherd");
        d.setPrice(25000);
       // System.out.println(d.getName());
       // System.out.println(d.getPrice());

        cars c = new cars();
        c.setName("BMW");
        c.setPrice(200000);
        c.setModel("3 series");
        c.setColour("white");
        System.out.println(c.getName());
         System.out.println(c.getPrice());
        System.out.println(c.getModel());
        System.out.println(c.getColour());





    }
}
