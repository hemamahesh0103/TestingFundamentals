package inheritance;

 interface Vehicle{
     void keys();
 }

 interface Bike extends Vehicle{
     void speed();
 }

 interface unicorn extends Vehicle{
     void color();
 }

 interface model{
     void cost();
 }


 class Vamsi implements Bike,unicorn,model{
     public void keys(){
        System.out.println("Keys inserted");
     }

     public void speed(){
         System.out.println("Bike Speed 90km ");
     }

     public void color(){
         System.out.println("Black Color");
     }

     public void cost(){
         System.out.println("2015 model ");
     }

 }

public class MultipleInterface {
     public static void main (String[]args){
         Vamsi v = new Vamsi();
         v.keys();
         v.speed();
         v.cost();
         v.color();
     }



}
