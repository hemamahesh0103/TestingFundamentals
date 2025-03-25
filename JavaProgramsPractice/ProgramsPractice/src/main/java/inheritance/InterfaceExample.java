package inheritance;
//Interface example
// used interface keyword to define the vehicle
//created method start and stop
 interface Vehicle1{
    void stop ();
      void start();
 }
    //created child class bus which implements vehicle
 class Bus implements Vehicle1{
     // passing strings to print output as bus is starting
    public void start(){
         System.out.println("bus is starting");
     }
        // passing strings to print output as bus is stopping


        public void stop(){
         System.out.println("bus is stopping");
     }
 }

 //created main class InterfaceExample

public class InterfaceExample {
    public static void main (String args[]){    //main method
        Vehicle1 v = new Bus(); //object creation
        v.start();
        v.stop();

    }

}
