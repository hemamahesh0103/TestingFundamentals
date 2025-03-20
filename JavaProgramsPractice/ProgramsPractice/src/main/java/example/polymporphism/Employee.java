package example.polymporphism;

public class Employee {
   public static String companyName = "teknomite";

    //static variable
    String empName;

    public Employee(String name) {
        empName = name;
         }
        public void display () {
            System.out.println(empName + " working at " + companyName);
        }

    }




