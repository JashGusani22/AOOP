class First{
    public void fromFirst()
    {
        System.out.println("This is First");
    }
}

class Second extends First{
    public void fromSecond()
    {
        System.out.println("This is Second");
    }
}
class Third extends Second{
    public void fromThird()
    {
        System.out.println("This is Third");
    }
}
public class StudentAccount {
    public static void main(String[] args) {
       Third obj= new Third();
        obj.fromFirst();
        obj.fromSecond();
        obj.fromThird();
    }

}
