public class P13{
    public static void main(String[] args) {
         String str = "Hello Word!!";

         char one = str.charAt(6);
         System.out.println(one);

         boolean two = str.contains("Hello");
         System.out.println(two);

        
         String three = str.format("Hello %s" , "How are you");
         System.out.println(three);

         int fourth = str.length();
         System.out.println(fourth);

         String[] fifth = str.split(" ");
         for(String word:fifth){
             System.out.println(word);
         }
     }
 }
