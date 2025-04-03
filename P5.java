public class P5{
   public static void main(String[] args) {
      int num = 30;
      int i;
      int j; 
     for( i=1;i<=n ; i++)
     {
         for(j = 2 ; j <= i ; j++){
             if(i%j ==0)
              {
                break;
               }
         }if(i ==j){
             System.out.println(j);   
         }
     }
   }
 }