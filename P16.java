
class First {
    public void First1(){
        System.out.println("First Class");
    }
}
class Second extends First{
    public void Second2(){
        System.out.println("Second Class");
    }
}
class Third extends First{
    public void Third3(){
        System.out.println("Third Class");
    }
}

public class Main{
    public static void main(String[] args) {
        Second obj1 = new Second();
        obj1.First1();
        obj1.Second2();

        Third obj2 = new Third();
        obj2.First1();
        obj2.Third3();
    }
}
