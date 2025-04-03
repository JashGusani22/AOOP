interface Animal{
    public void Eat();
}
interface sound{
    public void makesound();
}
class Dog implements Animal,sound{
    public void Eat(){
         System.out.println("I can eat..");
    }
    public void makesound(){
        System.out.println("I can break....");
    }
}
public class Main{
    public static void main(String[] args) {
        Dog obj = new Dog();
        obj.Eat();
        obj.makesound();
    }
}