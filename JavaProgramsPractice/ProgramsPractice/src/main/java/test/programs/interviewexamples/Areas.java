package test.programs.interviewexamples;

public class Areas {
    //A class is a template or blue-print.
    //A class helps us to create our own Data-Types.

    //what all data it can save or
    //what all work it can do must be explicitly defined in a class.
    //Variable that is declared outside all methods.
    int radius;
    int length;
    int breadth;
    int height;
    //A variable converted in constant only if you use final keyword.
    final double PI = 3.14;

    //constructor is a concept
    //It will help to intialize (assigning values) to instance variable and no static keyword.
    //constructor name: ClassName()
    public Areas(int radius){
        //There will be no return type for the constructor.
        //constructor is executed while creating the object itself.
        this.radius = radius;
    }

    public Areas(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
    }

    public double areaOfCircle(){
        return PI * radius;
    }

    public int areaOfRectangle(){
        return length * breadth;
    }

    //Local Variable: A variable that is declared inside a method/constructor is known as local variable.
    //Instance Variable: A variable that is declared outside all methods is known as instance variable.
    //Static Variable or Class Variable: A variable that is declared outside all methods with static keyword

    //difference between static variable and instance variable:
    //The value of instance variable will vary from one object to another object.
    //The value of static variable will be same for all objects.
}
