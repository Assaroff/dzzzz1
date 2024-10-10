import java.util.Scanner;
public class zadacha9 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Введите a (a > 0): ");
            double a = scanner.nextDouble();

            System.out.print("Введите b: ");
            double b = scanner.nextDouble();

            System.out.print("Введите c: ");
            double c = scanner.nextDouble();

            // Коэффициенты уравнения
            double A = 2 * a;
            double B = b;
            double C = c;

            // Вычисление дискриминанта
            double D = B * B - 4 * A * C;

            // Проверка дискриминанта
            if (D < 0) {
                System.out.println("Вещественных корней нет.");
            } else if (D == 0) {
                double x = -B / (2 * A);
                System.out.printf("Уравнение имеет один вещественный корень: x = %.2f%n", x);
            } else {
                double x1 = (-B + Math.sqrt(D)) / (2 * A);
                double x2 = (-B - Math.sqrt(D)) / (2 * A);
                System.out.printf("Уравнение имеет два вещественных корня: x1 = %.2f, x2 = %.2f%n", x1, x2);
            }

            scanner.close();
        }
    }




