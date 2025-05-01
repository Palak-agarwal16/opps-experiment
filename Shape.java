abstract class Shape {
    abstract void calculateArea();
}

class Rectangle extends Shape {
    double length = 5, width = 3;

    @Override
    void calculateArea() {
        double area = length * width;
        System.out.println("Area of Rectangle: " + area);
    }
}

