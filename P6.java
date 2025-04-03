public class P6{
   public int ernum;
   public String name;
   public P6(String name , int ernum){
       this.ernum = ernum;
       this.name = name;
    }
     public static void main(String[] args) {
         P6 s1 = new Student("Jash", 22);
         P6 s2 = new Student("Veer", 67);
         P6 s3 = new Student("Dip", 72);
         System.out.println(s1.name);
         System.out.println(s2.name); 
         System.out.println(s3.name);
     }
}