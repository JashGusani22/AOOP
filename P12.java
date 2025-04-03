 public class Shape{
     Shape(float radius){
         System.out.println("Area of Circle is:- " + ((radius * radius) * 3.14));
    }
    Shape(float legnth , float width ){
         System.out.println("Area of Rectangle is:- " + (legnth *width));
     }
     public static void main(String[] args) {
         Shape S1= new Shape(5.0f);
         Shape S2= new Shape(5.0f , 3.0f);
     }
 }