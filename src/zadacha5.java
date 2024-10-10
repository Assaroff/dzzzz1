import java.util.Scanner;

public class zadacha5 {

    public static void main(String[] args) {
        // 4.10. Даны радиус круга и сторона квадрата. У какой фигуры площадь больше?

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите r (радиус круга) = ");
        double r = scanner.nextInt();

        System.out.print("Введите a (сторона квадрата) = ");
        double a = scanner.nextInt();

        double numberPi = 3.14;

        double squareCircle = numberPi * r * r; // площадь круга

        double squareSquare = a * a; // площадь квадрата

        if (squareCircle >= squareSquare) {
            System.out.print("Площадь круга больше" + squareCircle);

        } else {
            System.out.print("Площадь квадрата больше" + squareSquare);
        }
        scanner.close();
    }
}


