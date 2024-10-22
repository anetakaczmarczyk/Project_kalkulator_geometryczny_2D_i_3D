public class Triangle extends Figure implements Printing{


    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c) {
        if (a<b+c && b<a+c && c<a+b){
        this.a = a;
        this.b = b;
        this.c = c;
        print();
        }
        else{
            System.out.println("Wprowadzone dane nie tworzą trójkąta");
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
        System.out.println("Type of figure - Triangle");
        System.out.println("Perimeter - " + calculatePerimeter());
        System.out.println("Area - " + calculateArea());

    }

}
