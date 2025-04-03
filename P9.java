public class P10 {

    static int count = 0;

    public P10() {
         count++;
     }

     static void printMessages() {
         System.out.println("Hello!");
     }

     public static void main(String[] args) {
         P10.printMessages();
         P10 M1 = new P10();
         P10 M2 = new P10();
         System.out.println(M1.count);
    }
 }