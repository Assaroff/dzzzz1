import java.util.Scanner;

public class zadacha11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите сторону a (положительное вещественное число): ");
        double a = scanner.nextDouble();

        System.out.print("Введите сторону b (положительное вещественное число): ");
        double b = scanner.nextDouble();

        System.out.print("Введите сторону c (положительное вещественное число): ");
        double c = scanner.nextDouble();

        // Проверка существования треугольника
        if (a > 0 && b > 0 && c > 0 && (a + b > c) && (a + c > b) && (b + c > a)) {
            System.out.println("Треугольник с такими сторонами существует.");
        } else {
            System.out.println("Треугольник с такими сторонами не существует.");
        }

        scanner.close();
    }
}