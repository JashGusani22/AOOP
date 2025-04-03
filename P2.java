public class P2{
public static void main(String[] args) {
 int num1 = 9;
 int num2 = 11;
 int num3 = 100;
  if(num1 > num2 && num1 > num3){
    System.out.println("Big Number :- " + num1);
  }else if(num2 > num1 && num2 > num3){   
     System.out.println("Big Number:- " + num2);
  }else{
       System.out.println("Big number:- " + num3);
   }
}   
}