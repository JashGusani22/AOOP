class Odd extends Thread{
     public void run(){
         for(int i = 1 ; i <= 200 ; i+=2){
             System.out.println("Odd is: " + i);
         }
     }
 }
 class Even extends Thread{
     public void run(){
         for(int i = 2 ; i <= 200 ; i+=2){
            System.out.println("Even is: " + i);
         }
     }
}
 public class P26{
     public static void main(String[] args) {
         Even et = new Even();
         Odd ot = new Odd();
         et.start();
         ot.start();
     }
}