abstract class Shape {
    abstract void area();
}

class Triangle extends Shape {
    double base, height;

    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    void area() {
        double result = base * height;
        System.out.println("Area of Triangle " + result);
    }
}

class Rectangle extends Shape {
    double length, width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    void area() {
        double result = length * width;
        System.out.println("Area of Rectange :" + result);
    }
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    void area() {
        double result = 3.14 * radius * radius;
        System.out.println("Area of Circle :" + result);
    }
}

public class Main {
    public static void main(String[] args) {
        Shape triangle = new Triangle(5, 10);
        Shape rectangle = new Rectangle(4, 6);
        Shape circle = new Circle(5);
        triangle.area();
        rectangle.area();
        circle.area();
    }
}
