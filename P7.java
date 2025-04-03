 public class P7{
     double height;
     double weight;
     public Rectangle(double height , double weight){
         this.height = height;
         this.weight = weight;
     }
    public static void main(String[] args) {
      Rectangle r1 = new  Rectangle(34.50 , 65.40);
        System.out.println(r1.height);
        System.out.println(r1.weight);
     }
 }