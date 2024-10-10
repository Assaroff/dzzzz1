package Zadacha1;
import java.util.Scanner;
public class zadacha4 {
    public static void main(String[] args) {
// 4.9. Известны две скорости: одна в километрах в час, другая — в метрах в секунду. Какая из скоростей больше?

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите скорость в км/ч: ");
        int km = scanner.nextInt();

        System.out.println("Введите скорость в м/c: ");
        int mc = scanner.nextInt();

        double translationKm = mc * 3.6;

        if (km > translationKm) {
            System.out.println("Первая скороть больше");

        } else {
            System.out.println("Вторая скорость больше");

        }
    }
}


