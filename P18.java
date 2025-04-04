class Car {
    String name;
    int topSpeed;

    
    public Car(String name, int topSpeed) {
        this.name = name;
        this.topSpeed = topSpeed;
    }

    @Override
    public String toString() {
        return "Car Name: " + name + ", Top Speed: " + topSpeed + " km/h";
    }
}

public class P18 { 

    
    public static void main(String[] args) {
       
        Car car1 = new Car("Ferrari", 350);
        Car car2 = new Car("Lamborghini", 340);
        Car car3 = new Car("Bugatti", 420);
        Car car4 = new Car("Tesla", 250);
        Car car5 = new Car("BMW", 240);

  
        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
        System.out.println(car4);
        System.out.println(car5);
    }
}