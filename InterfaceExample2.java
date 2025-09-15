// Write a Java program using an interface Shape with methods area() and perimeter(). Implement this interface in Circle and Rectangle classes.

interface Shape {
    double area();

    double perimiter();
}

class Circle implements Shape {

    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    public double area() {
        return Math.PI * radius * radius;
    }

    public double perimiter() {
        return 2 * Math.PI * radius;
    }

}

class Rectangle implements Shape {
    double length, width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double area() {
        return length * width;
    }

    public double perimiter() {
        return 2 * (length + width);
    }
}

public class InterfaceExample2 {

    public static void main(String[] args) {
        Shape c = new Circle(5);
        System.out.println(c.area());
        System.out.println(c.perimiter());

        Shape r = new Rectangle(4, 6);
        System.out.println(r.area());
        System.out.println(r.perimiter());

    }
}

