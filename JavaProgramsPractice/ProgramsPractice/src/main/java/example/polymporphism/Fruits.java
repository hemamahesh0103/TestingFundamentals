package example.polymporphism;

import javax.net.ssl.ExtendedSSLSession;
import java.awt.*;
import java.util.concurrent.Callable;
// parent class
public class Fruits {

   public void taste(){
        System.out.println("Fruits are Sweet");
    }

   public static class Mango extends Fruits{

       public void taste(){
            System.out.println("Mango is Sweet");

        }

      public static class Orange extends Mango{
          public void taste(){
                System.out.println("Orange is sour");
            }
        }

    }



    }





