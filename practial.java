interface Shape {
    double calculateArea();
}

class Circle implements Shape {
    double r;

    Circle(double r) {
        this.r = r;
    }

    public double calculateArea() {
        return 3.14 * r * r;
    }
}

class Square implements Shape {
    double s;

    Square(double s) {
        this.s = s;
    }

    public double calculateArea() {
        return s * s;
    }
}

public class Main {
    public static void main(String[] args) {

        Shape c = new Circle(5);
        Shape sq = new Square(4);

        System.out.println("Area of Circle: " + c.calculateArea());
        System.out.println("Area of Square: " + sq.calculateArea());
    }
}