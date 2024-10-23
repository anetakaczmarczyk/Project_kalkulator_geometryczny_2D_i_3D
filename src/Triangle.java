public class Triangle extends Figure implements Printing{


    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c) {
        if ((a<b+c && b<a+c && c<a+b) && (a>0 && b>0 && c>0)) {
        this.a = a;
        this.b = b;
        this.c = c;
        }
        else{
            System.out.println("Wprowadzone dane nie tworzą trójkąta lub są nieprawidłowe");
        }
    }

    @Override
    public double calculateArea() {
        double p = calculatePerimeter()/2;
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }

    @Override
    public double calculatePerimeter() {
        return a + b + c;
    }

    @Override
    public void print() {
        if (a>0 && b>0 && c>0) {
        System.out.println("Type of figure - Triangle");
        System.out.println("Perimeter - " + calculatePerimeter());
        System.out.println("Area - " + calculateArea());
        }

    }

}
