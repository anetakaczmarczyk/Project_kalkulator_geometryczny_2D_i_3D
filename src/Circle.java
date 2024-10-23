public class Circle extends Figure implements Printing{

    private double radius;

    public Circle(double radius) {
        if (radius > 0) {
        this.radius = radius;
        }
        else {
            System.out.println("Radius must be greater than 0");
        }
    }

    @Override
    public double calculateArea() {
        return Math.pow(radius, 2) * Math.PI;
    }

    @Override
    public double calculatePerimeter() {
        return 2*Math.PI * radius;
    }

    @Override
    public void print() {
        System.out.println("Type of figure - Circle");
        System.out.println("Perimeter - " + calculatePerimeter());
        System.out.println("Area - " + calculateArea());
    }
}
