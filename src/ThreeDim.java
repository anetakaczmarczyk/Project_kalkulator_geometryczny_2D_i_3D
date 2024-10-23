public class ThreeDim extends Figure implements Printing{

    private final Figure figure;
    private final double height;

    public ThreeDim(Figure figure, double height){
        this.figure = figure;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return figure.calculateArea() * height;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * figure.calculatePerimeter() + 4* height;
    }

    @Override
    public void print() {
        System.out.println("Type of figure - ThreeDim");
        System.out.println("Perimeter - " + calculatePerimeter());
        System.out.println("Area - " + calculateArea());
    }
}
