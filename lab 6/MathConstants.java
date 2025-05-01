package lab_6;

public class MathConstants {
	    final double PI = 3.14159;

	    final void displayPI() {
	        System.out.println("Value of PI: " + PI);
	    }
	}
class Circle extends MathConstants {
    void calculateArea(double radius) {
        double area = PI * radius * radius;
        System.out.println("Circle Area: " + area);
    }
}
