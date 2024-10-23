public class Square extends Figure implements Printing{
    private double side;

    public Square(double side) {
        if (side > 0) {
        this.side = side;
        }
        else {
            System.out.println("Side must be greater than 0.");
        }
    }

    @Override
    public double calculateArea() {
        return side*side;
    }

    @Override
    public double calculatePerimeter() {
        return 4*side;
    }

    @Override
    public void print() {
        System.out.println("Type of figure - Square");
        System.out.println("Perimeter - " + calculatePerimeter());
        System.out.println("Area - " + calculateArea());
    }
}
