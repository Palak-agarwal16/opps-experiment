public class AreaCalculator {

    // Rectangle
    static double area(double length, double width) {
        return length * width;
    }

    // Square
    static double area(double side) {
        return side * side;
    }

    // Circle
    static double area(float radius) {
        return Math.PI * radius * radius;
    }

    // Triangle
    static double area(double base, double height, boolean isTriangle) {
        if (isTriangle) {
            return 0.5 * base * height;
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println("Area of Rectangle (5x3): " + area(5.0, 3.0));
        System.out.println("Area of Square (4): " + area(4.0));
        System.out.println("Area of Circle (r=2.5): " + area(2.5f));
        System.out.println("Area of Triangle (base=6, height=4): " + area(6.0, 4.0, true));
    }
}
