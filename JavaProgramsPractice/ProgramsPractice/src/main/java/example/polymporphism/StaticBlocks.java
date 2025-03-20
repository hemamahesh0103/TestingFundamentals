package example.polymporphism;

public class StaticBlocks {

  public static int a;
  public static int b;

     static {
       System.out.println("hello static");

       a=10;
       b=5;
   }
}
