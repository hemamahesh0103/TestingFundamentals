package example.polymporphism;

// Abstract
abstract  class Shape1{
  abstract   void draw();
  void display(){
      System.out.println("display  the shape");
  }
}
class Circle extends Shape1{
    void draw(){
        System.out.println("display  the circle");

    }
}

public class Shape{
    public static void main (String[]args){
        Circle c= new Circle();
        c.display();
        c.draw();




    }
}





