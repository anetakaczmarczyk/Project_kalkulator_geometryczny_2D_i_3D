import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class UserInterface {
    public UserInterface() throws IOException {
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        System.out.println("Welcome in geometry calculator 2D and 3D");
        while (flag) {

            System.out.println("\nPlease enter your choice");
            System.out.println("1. Triangle");
            System.out.println("2. Square");
            System.out.println("3. Circle");
            System.out.println("4. Prism");
            System.out.println("0. Exit");
            System.out.print("Your choice: ");
            int choice;
            while (true){
                try {
                    choice = sc.nextInt();
                    break;
                }
                catch (InputMismatchException exception) {
                    System.out.println("Invalid choice, please enter a number:");
                    sc.next();
                }
            }
             switch (choice){
                case 1:
                    Triangle t = getValidTriangle(sc);
                    t.print();
                    System.out.println("Press enter to continue.....");
                    System.in.read();
                    break;
                case 2:
                    Square s = getValidSquare(sc);
                    s.print();
                    System.out.println("Press enter to continue.....");
                    System.in.read();
                    break;
                case 3:
                    Circle c = getValidCircle(sc);
                    c.print();
                    System.out.println("Press enter to continue.....");
                    System.in.read();
                    break;
                case 4:
                    System.out.println("\nInsert a base: ");
                    System.out.println("1. Triangle");
                    System.out.println("2. Square");
                    System.out.println("3. Circle");
                    System.out.println("0. Back");
                    int choice2;
                    while (true){
                        try {
                            choice2 = sc.nextInt();
                            break;
                        }
                        catch (InputMismatchException exception) {
                            System.out.println("Invalid choice, please enter a number:");
                            sc.next();
                        }
                    }
                    Figure figure = null;
                    boolean back = false;
                    boolean flag2 = true;
                    while(flag2){
                        switch (choice2){
                            case 1:
                                do {
                                figure = getValidTriangle(sc);
                                }while (figure.calculateArea() == 0 );
                                flag2 = false;
                                break;
                            case 2:
                                figure = getValidSquare(sc);
                                flag2 = false;
                                break;
                            case 3:
                                figure = getValidCircle(sc);
                                flag2 = false;
                                break;
                            case 0:
                                back = true;
                                flag2 = false;
                                break;
                            default:
                                System.out.println("Invalid choice");
                        }
                        if(back){
                            break;
                        }
                    }
                    if (!back){

                    System.out.println("Insert height: ");
                    System.out.print("h = ");
                    double h = getValidNumber(sc);
                    ThreeDim prism = new ThreeDim(figure, h);
                    prism.print();
                    System.out.println("Press enter to continue.....");
                    System.in.read();
                    }
                    break;
                    case 0:
                        flag = false;
                        break;


                default:
                    System.out.println("Invalid choice");
            }

        }
            sc.close();
    }
    private double getValidNumber(Scanner sc) {
        while (true){
            try {
                while (true){
                    double d = sc.nextDouble();
                    if (d>0){
                        return d;
                    }
                    else {
                        System.out.println("Invalid number, please enter a positive number:");
                    }
                }
            }
            catch (InputMismatchException exception) {
                System.out.println("Invalid input, please enter a number:");
                sc.next();
            }
        }
    }
    private Triangle getValidTriangle(Scanner sc) {
        System.out.println("Insert a triangle: ");
        System.out.print("a = ");
        double a = getValidNumber(sc);
        System.out.print("b = ");
        double b = getValidNumber(sc);
        System.out.print("c = ");
        double c = getValidNumber(sc);
        return new Triangle(a, b, c);
    }
    private Square getValidSquare(Scanner sc) {
        System.out.println("Insert a square: ");
        System.out.print("side = ");
        double side = getValidNumber(sc);
        return new Square(side);
    }
    private Circle getValidCircle(Scanner sc) {
        System.out.println("Insert a circle: ");
        System.out.print("radius = ");
        double radius = getValidNumber(sc);
        return new Circle(radius);
    }
}
