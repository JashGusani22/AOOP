public class P9 {

    static int count = 0;

    public P9() {
         count++;
     }

     static void printMessages() {
         System.out.println("Hello!");
     }

     public static void main(String[] args) {
         P9.printMessages();
         P9 M1 = new P9();
         P9 M2 = new P9();
         System.out.println(M1.count);
    }
 }