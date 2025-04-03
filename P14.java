class Animal{
     public void Eating() {
         System.out.println("Eating...");
    }
 }
 class Dog extends Animal {
     public void Animalname() {
         System.out.println("Dog...");
     }
 }

 public class Main{
         public static void main(String[] args)
      {
           Dog d1 = new Dog();
           d1.Eating();
           d1.Animalname();
      }
 }