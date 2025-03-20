package test.programs.interviewexamples;

import example.polymporphism.Employee;
import example.polymporphism.Fruits;
import example.polymporphism.Maths;
import example.polymporphism.StaticBlocks;
import inheritance.Intern;
import inheritance.Student;
import test.programs.classandobjects.*;

import static example.polymporphism.StaticBlocks.a;

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

        Dog d = new Dog();
        d.setName("German Shepherd");
        d.setPrice(25000);
       // System.out.println(d.getName());
       // System.out.println(d.getPrice());

        Cars c = new Cars();
        c.setName("BMW");
        c.setPrice(200000);
        c.setModel("3 series");
        c.setColour("white");

       /* System.out.println(c.getName());
         System.out.println(c.getPrice());
        System.out.println(c.getModel());
        System.out.println(c.getColour()); */

        Phone ph = new Phone();
        ph.setApp("Whatsapp");
        ph.setCallaccept("Accepted Call");
        ph.setCalldecline("Decline Call");
        ph.setPhonemodel("16");
        ph.setPhonepwd(261998);
        ph.setSounddown("Decrease the volume");
        ph.setSoundup("Increase the volume");
        ph.setPhoneno(848589656);
        ph.setPhonename("I Phone");

       // System.out.println(ph.getPhonename());


      //  Fruits f = new Fruits();
     //   f.taste();
        Employee emp1 = new Employee("hema");
        Employee emp2 = new Employee("kavya");

        Employee.companyName = "e solutions";

     //   emp1.display();
       // emp2.display();

      //  System.out.println(Maths.add(10,20));

      //  System.out.println(StaticBlocks.a);
        //System.out.println(StaticBlocks.b);

        Student s = new Student();
        Intern i=  new Intern();

        System.out.println("Grade : " + s.grade + "\nIntern : " + s.benefit + "\n Company :" +i.company);











    }
}
