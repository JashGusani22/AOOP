public class P3{
    public static void main(String[] args) {
        int num = 123;
         int rnum = 0;
         while(number != 0){
             int digit = number % 10;
             rnum = rnum*10+digit;
            number /= 10;
        }
        System.out.println(rnum);
    }
 }