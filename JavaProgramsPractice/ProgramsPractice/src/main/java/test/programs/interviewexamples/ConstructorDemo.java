package test.programs.interviewexamples;

public class ConstructorDemo {
    /*
     * How can we create a Constructor in JAVA?
     * 1. Name of constructor must be same name of the class.
     * 2. There will not be any return type.
     * 3. Every class will be having default constructor created by compiler.
     * 4. If Developer creates his own constructor then default constructor will not be applied.
     * 5. If there is any parameterized/custom constructor developer should override default constructor
     */
    private int num1;
    private int num2;

    //parameterized constructor.
    public ConstructorDemo(int num1, int num2){ //CascadingCase
        this.num1 = num1;
        this.num2 = num2;
    }

    //default constructor
    public ConstructorDemo(){
    }




    //creating a method to print HelloWorld()
    public void printVariable(){ //camelCase
        System.out.println("num 1 value is: "+num1);
        System.out.println("num 2 value is: "+num2);
    }


}
