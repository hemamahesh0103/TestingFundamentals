package example.polymporphism;

public class MethodOverloading {

    //what is meant by method signature?
    /*
        returntype methodName(params){}
     */

    void printName(String name){
        System.out.println(name);
    }

    void printName(String name, int age){
        
    }

    void printName(int age, String name){

    }

    void printName(int name){

    }


}
